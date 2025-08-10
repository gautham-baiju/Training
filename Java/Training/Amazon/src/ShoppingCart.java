package Java.Training.Amazon.src;

import java.util.ArrayList;

public class ShoppingCart implements Cart {

    private ArrayList<CartItem> items = new ArrayList<>();

    public void addProduct(PhysicalProduct product, int quantity) {
        this.items.add(new CartItem(product, quantity));
    }

    public ArrayList<CartItem> getItems() {
        return this.items;
    }
}
