package se.alex.lexicon;

// Concrete class representing fries, extending MenuItem
public class Fries extends MenuItem {
    private final String type; // Final field for type of fries (regular, curly, waffle)

    public Fries(String name, double price, String type, Size size) {
        super(name, price, size); // Call the constructor of the parent class
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent class method
        System.out.println("Type: " + type);
    }

    @Override
    public void prepare() {
        System.out.println("Frying the fries...");
    }

    // Getter for type
    public String getType() {
        return type;
    }
}
