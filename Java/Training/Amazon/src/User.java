package Java.Training.Amazon.src;

public class User {
    private String username;
    private String password;
    private ShoppingCart cart = new ShoppingCart();

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public ShoppingCart getCart() {
        return this.cart;
    }

    public PurchaseOrder placeOrder() {
        PurchaseOrder order = new PurchaseOrder(this.cart);
        this.cart = new ShoppingCart();
        return order;
    }
}
