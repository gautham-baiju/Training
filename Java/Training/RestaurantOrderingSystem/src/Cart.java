package Java.Training.RestaurantOrderingSystem.src;

public class Cart extends Order {
    Cart(Customer customer) {
        super(customer);
    }

    public void removeItem(OrderItem cartItem) {
        super.getAllItems().remove(cartItem);
        this.setTotalPrice(
                getTotalPrice() - cartItem.getItem().getPrice() * cartItem.getQuantity());
    }

    public void updateQuantity(OrderItem cartItem, int quantity) {
        for (OrderItem item : super.getAllItems()) {
            if (item.equals(cartItem)) {
                item.setQuantity(quantity);
                break;
            }
        }
    }
}
