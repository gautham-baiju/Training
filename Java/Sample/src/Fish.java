package Java.Sample.src;

public class Fish implements Predator, Prey {
    @Override
    public void flee() {
        System.out.println("Fish is swimming away");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is huntingg");
    }
}
