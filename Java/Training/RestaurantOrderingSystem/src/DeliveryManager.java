package Java.Training.RestaurantOrderingSystem.src;

import java.util.ArrayList;

public class DeliveryManager {

    private ArrayList<Delivery> deliveries = new ArrayList<>();
    private ArrayList<DeliveryPerson> deliveryPersons = new ArrayList<>();

    public void scheduleDelivery(Delivery delivery) {
        this.deliveries.add(delivery);
        this.assignDeliveryPerson(delivery);
    }

    private void assignDeliveryPerson(Delivery delivery) {
        for (DeliveryPerson deliveryPerson : deliveryPersons) {
            if (deliveryPerson.getIsAvailable()) {
                deliveryPerson.assignDelivery(delivery);
                return;
            }
        }
        System.out.println("No delivery persons available at the moment.");
    }

    public void updateDeliveryStatus(Delivery delivery, String status) {
        delivery.updateStatus(status);
    }
}
