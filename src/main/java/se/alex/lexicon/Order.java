package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

// Class to manage an order consisting of multiple menu items
public class Order {
    private final List<MenuItem> items; // List to store menu items
    private final String customerId; // The customer ID who placed the order

    // Constructor to initialize the items list and customer ID
    public Order(String customerId) {
        this.items = new ArrayList<>();
        this.customerId = customerId;
    }

    // Method to add an item to the order
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Method to display all items in the order and customer details
    public void displayOrder() {
        System.out.println("Customer ID: " + customerId); // Display customer ID
        for (MenuItem item : items) {
            item.displayDetails();
            System.out.println("---------------");
        }
    }

    // Method to calculate the total cost of the order before tax
    private double getTotalBeforeTax() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Method to calculate the total tax for the order
    private double getTotalTax() {
        double totalTax = 0;
        for (MenuItem item : items) {
            totalTax += item.calculateTax();
        }
        return totalTax;
    }

    // Method to calculate the total cost of the order including tax
    public double getTotal() {
        double totalBeforeTax = getTotalBeforeTax();
        double totalTax = getTotalTax();
        return totalBeforeTax + totalTax;
    }

    // Method to prepare all items in the order
    public void prepareOrder() {
        for (MenuItem item : items) {
            item.prepare();
        }
    }
}
