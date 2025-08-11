package Java.Training.RestaurantOrderingSystem.src;

public class DeliveryPerson {
    private String name;
    private String contactNumber;
    private boolean isAvailable;

    DeliveryPerson(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.isAvailable = true;
    }

    public String getName() {
        return this.name;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void assignDelivery(Delivery delivery) {
        if (this.isAvailable) {
            delivery.assignDeliveryPerson(this);
            this.isAvailable = false;
        } else {
            System.out.println("Delivery person is busy.");
        }
    }
}
