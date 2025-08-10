package Java.Training.RestaurantOrderingSystem.src;

public class MenuItem {
    private String name;
    private String description;
    private double price;

    MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }
}
