package Java.Training.RestaurantOrderingSystem.src;

import java.util.HashSet;

public class Delivery {
    private HashSet<String> addresses;

    Delivery() {
        this.addresses = new HashSet<>();
    }

    public HashSet<String> getAddresses() {
        return this.addresses;
    }

    public void addAddress(String address) {
        this.addresses.add(address);
    }

    public void removeAddress(String address) {
        this.addresses.remove(address);
    }
}
