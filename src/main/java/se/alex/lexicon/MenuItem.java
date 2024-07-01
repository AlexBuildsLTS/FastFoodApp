package se.alex.lexicon;

// Abstract class representing a general menu item
public abstract class MenuItem implements Taxable {
    private final String name; // Final field to ensure immutability
    private final double price; // Final field to ensure immutability
    private final Size size; // Final field for size

    // Constructor to initialize name, price, and size
    public MenuItem(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    // Concrete method to display details of the menu item
    public void displayDetails() {
        System.out.println("Name: " + name + ", Price: $" + price + ", Size: " + size);
    }

    // Abstract method to be implemented by subclasses
    public abstract void prepare();

    // Default implementation of calculateTax
    @Override
    public double calculateTax() {
        // Default tax rate is 8%
        return price * 0.08;
    }

    // Getters (no setters needed since fields are final)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }
}
