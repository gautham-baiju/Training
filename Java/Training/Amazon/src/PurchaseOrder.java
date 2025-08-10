package Java.Training.Amazon.src;

import java.util.ArrayList;

public class PurchaseOrder implements Order {

    private ArrayList<CartItem> purchasedProducts;
    private double totalPrice;
    private String orderStatus;

    PurchaseOrder(ShoppingCart cart) {
        this.totalPrice = 0.0;
        this.orderStatus = "processing";
        this.purchasedProducts = new ArrayList<>(cart.getItems());
        for (CartItem cartItem : this.purchasedProducts) {
            totalPrice += cartItem.product.getPrice() * cartItem.quantity;
            cartItem.product.reduceQuantity(cartItem.quantity);
        }
    }

    public void shipProduct() {
        this.orderStatus = "shipped";
        for (CartItem cartItem : this.purchasedProducts) {
            System.out.println("Shipped product: " + cartItem.product.getName() + ": with tracking number: "
                    + cartItem.product.generateTrackingNumber());
        }
    }

    public ArrayList<CartItem> getPurchasedProducts() {
        return this.purchasedProducts;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

}
