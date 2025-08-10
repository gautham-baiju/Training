package Java.Training.Amazon.src;

public class CartItem {
    public PhysicalProduct product;
    public int quantity;

    CartItem(PhysicalProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}