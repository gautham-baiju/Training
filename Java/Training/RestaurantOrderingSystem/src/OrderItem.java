package Java.Training.RestaurantOrderingSystem.src;

public class OrderItem {
    private MenuItem item;
    private int quantity;

    OrderItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() {
        return this.item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
