package Java.Sample.src;

public class AnotherCar {
    private final String model;
    private String color;

    AnotherCar(String model, String color) {
        this.model = model;
        this.color = color;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
