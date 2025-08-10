package Java.Sample.src;

public class Animal {
    String name = "apple";
    int age;

    Animal() {
        this.name = "apple";
        this.age = 0;
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void move() {
        System.out.println("Movinggg");
    }

    @Override
    public String toString() {
        return this.name + " object";
    }
}