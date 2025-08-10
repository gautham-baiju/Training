package Java.Training.Amazon.src;

import java.util.ArrayList;

public interface Order {
    ArrayList<CartItem> getPurchasedProducts();

    double getTotalPrice();

    String getOrderStatus();

}
