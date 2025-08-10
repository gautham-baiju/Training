package Java.Training.RestaurantOrderingSystem.src;

import java.util.HashSet;

public class Customer {
    String name;
    HashSet<Order> orders = new HashSet<>();
    Cart shoppingCart = new Cart(this);
    Delivery delivery = new Delivery();

    public Order createOrder() {
        Order newOrder = new Order(this);
        this.orders.add(newOrder);
        return newOrder;
    }

}
