package Java.Training.RestaurantOrderingSystem.src;

import java.util.ArrayList;
import java.util.HashSet;

public class Customer {
    private String name;
    private HashSet<Order> orders = new HashSet<>();
    private Cart shoppingCart = new Cart(this);
    private ArrayList<String> addresses = new ArrayList<>();

    public Order createOrder() {
        Order newOrder = new Order(this);
        this.orders.add(newOrder);
        return newOrder;
    }

    public String getName() {
        return this.name;
    }

    public void addAddress(String address) {
        this.addresses.add(address);
    }

    public ArrayList<String> getAddresses() {
        return this.addresses;
    }

    public Cart getShoppingCart() {
        return this.shoppingCart;
    }

}
