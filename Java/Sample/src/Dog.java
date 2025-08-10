package Java.Sample.src;

public class Dog extends Animal {

    double gpa;

    Dog(double gpa) {
        super();
        this.gpa = gpa;
    }

    Dog(String name, int age, double gpa) {
        super(name, age);
        System.out.println(super.name);
        this.gpa = gpa;
    }

    @Override
    void move() {
        System.out.println("Moving differently");
    }
}
