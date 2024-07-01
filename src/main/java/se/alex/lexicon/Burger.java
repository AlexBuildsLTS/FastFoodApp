package se.alex.lexicon;

//  class representing a burger
public class Burger extends MenuItem {

    public Burger(String name, double price, Size size) {
        super(name, price, size); // Call the constructor of the parent class
    }

    // Override the displayDetails method to include specific details for Burger
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent class method
    }

    // Implement the prepare method
    @Override
    public void prepare() {
        System.out.println("Grilling the burger...");
    }

    // If Burger has a different tax rate, override the calculateTax method
    @Override
    public double calculateTax() {
        // Tax rate for Burger is 10%
        return getPrice() * 0.10;
    }
}
