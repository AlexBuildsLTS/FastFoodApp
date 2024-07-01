package se.alex.lexicon;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take customer ID
        String customerId;
        while (true) {
            System.out.println("Enter your customer ID (alphanumeric, 6-10 characters):");
            customerId = scanner.nextLine();
            if (isValidCustomerId(customerId)) {
                break;
            } else {
                System.out.println("Invalid customer ID. Please try again.");
            }
        }

        // Create an order for the customer
        Order order = new Order(customerId);

        boolean ordering = true;

        while (ordering) {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. Cheeseburger (Large) - $5.99");
            System.out.println("2. Big Mac (Medium) - $6.99");
            System.out.println("3. Curly Fries (Medium) - $2.99");
            System.out.println("4. Cola (Small) - $1.99");
            System.out.println("5. Complete Order");

            // Take user choice
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    order.addItem(new Burger("Cheeseburger", 5.99, Size.LARGE));
                    break;
                case 2:
                    order.addItem(new Burger("Big Mac", 6.99, Size.MEDIUM));
                    break;
                case 3:
                    order.addItem(new Fries("Curly Fries", 2.99, "Curly", Size.MEDIUM));
                    break;
                case 4:
                    order.addItem(new Drink("Cola", 1.99, "Cola", Size.SMALL));
                    break;
                case 5:
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        // Display the order details
        System.out.println("Order Details:");
        order.displayOrder();

        // Prepare the order
        System.out.println("Preparing Order:");
        order.prepareOrder();

        // Display the total cost including tax
        System.out.println("Total Cost (including tax): $" + order.getTotal());

        scanner.close();
    }

    // Method to validate customer ID
    private static boolean isValidCustomerId(String customerId) {
        if (Pattern.matches("^[a-zA-Z0-9]{6,10}$", customerId)) return true;
        else return false;
    }
}
