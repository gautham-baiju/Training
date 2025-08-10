package Java.Sample.src;

public class CompositionCar {
    String model;
    int year;
    Engine engine;

    CompositionCar(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("lessggooo...");
    }
}
