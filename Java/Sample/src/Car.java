package Java.Sample.src;

public class Car {

    String name;
    String color;
    boolean isRunning;

    static int carNumber = 0;

    Car(String name, String color, boolean isRunning) {
        this.name = name;
        this.color = color;
        this.isRunning = isRunning;
        carNumber++;
    }

    void start() {
        System.out.println("You start the engine.");
    }

    void stop() {
        System.out.println("You stop the engine.");
    }
}