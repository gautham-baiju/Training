package Java.Training.RestaurantOrderingSystem.src;

import java.util.HashSet;
import java.util.UUID;

public class Order {
    private String id;
    private Customer customerDetails;
    private HashSet<OrderItem> items = new HashSet<>();
    private double totalPrice;

    Order(Customer customer) {
        this.customerDetails = customer;
        this.id = UUID.randomUUID().toString();
        this.totalPrice = 0.0;
    }

    public OrderItem addItem(MenuItem item, int quantity) {
        OrderItem orderItem = new OrderItem(item, quantity);
        this.totalPrice += item.getPrice() * quantity;
        this.items.add(orderItem);
        return orderItem;
    }

    public HashSet<OrderItem> getAllItems() {
        return this.items;
    }

    public String getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customerDetails;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
