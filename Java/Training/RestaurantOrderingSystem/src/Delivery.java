package Java.Training.RestaurantOrderingSystem.src;

public class Delivery {
    private String deliveryAddress;
    private String deliveryStatus;
    private int estimatedTimeMinutes;
    private DeliveryPerson deliveryPerson;
    private Order order;

    Delivery(Order order, String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = "RECEIVED";
        this.order = order;
        this.calculateEstimatedTime();
    }

    private void calculateEstimatedTime() {
        this.estimatedTimeMinutes = (int) Math.floor(Math.random() * 30);
    }

    public void assignDeliveryPerson(DeliveryPerson person) {
        this.deliveryPerson = person;
    }

    public void updateStatus(String status) {
        this.deliveryStatus = status;
    }

    public String getDeliveryInfo() {
        return this.order.getId() + this.deliveryAddress + this.deliveryStatus + this.estimatedTimeMinutes;
    }

    public DeliveryPerson getDeliveryPerson() {
        return this.deliveryPerson;
    }
}
