package LLD1.Multithreading;

public class NumberPrinter implements Runnable {

    private final int value;

    NumberPrinter(int x) {
        this.value = x;
    }

    @Override
    public void run() {
        System.out.println("Number is " + value + " " + Thread.currentThread().getName());
    }
}
