package Java.Sample.src;

public class MyRunnableTwo implements Runnable {

    private final String text;

    MyRunnableTwo(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                // System.out.println(Thread.currentThread().getName() + " " + i);
                System.out.println(this.text);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
