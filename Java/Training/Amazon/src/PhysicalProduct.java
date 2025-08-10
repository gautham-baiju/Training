package Java.Training.Amazon.src;

import java.util.UUID;

public class PhysicalProduct implements Product, Shippable {
    private String name;
    private double price;
    private int quantity;

    PhysicalProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void reduceQuantity(int amount) {
        this.quantity -= amount;
    }

    public String generateTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
