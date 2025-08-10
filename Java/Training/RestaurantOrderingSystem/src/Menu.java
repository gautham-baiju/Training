package Java.Training.RestaurantOrderingSystem.src;

import java.util.HashSet;

public class Menu {
    private static HashSet<MenuItem> items = new HashSet<>();

    public static void addMenuItem(String name, String description, double price) {
        MenuItem newItem = new MenuItem(name, description, price);
        items.add(newItem);
    }

    public static HashSet<MenuItem> getMenuItems() {
        return items;
    }
}
