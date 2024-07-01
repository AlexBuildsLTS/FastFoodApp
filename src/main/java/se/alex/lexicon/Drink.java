package se.alex.lexicon;


public class Drink extends MenuItem {
    private final String flavor; // Final field for flavor of drink

    public Drink(String name, double price, String flavor, Size size) {
        super(name, price, size); // Call the constructor of the parent class
        this.flavor = flavor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent class method
        System.out.println("Flavor: " + flavor);
    }

    @Override
    public void prepare() {
        System.out.println("Pouring the drink...");
    }

    // Getter for flavor
    public String getFlavor() {
        return flavor;
    }
}
