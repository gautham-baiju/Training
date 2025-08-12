package Java.Streams.src;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    record Car(String color, String make, String model) {
    }

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("blue", "bmw", "123"),
                new Car("yellow", "bmw", "456"),
                new Car("black", "mercedes", "777"),
                new Car("blue", "mercedes", "666"));

        List<Car> blueCars = cars.stream().filter(c -> c.color.equals("blue")).toList();

        List<String> carMakeList = cars.stream().map(c -> c.make).toList();

        List<String> carMakeModelList = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).toList();

        // System.out.println(blueCars);
        // System.out.println(carMakeList);
        System.out.println(carMakeModelList);
    }
}