package LLD1.PrintInOrder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class main {
    static Semaphore firsSemaPhore = new Semaphore(1);
    static Semaphore secondSemaPhore = new Semaphore(0);
    static Semaphore thirdSemaPhore = new Semaphore(0);

    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);

        e.execute(new PrintFirst());
        secondSemaPhore.release();

        try {
            secondSemaPhore.acquire();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        e.execute(new PrintSecond());

        thirdSemaPhore.release();

        try {
            thirdSemaPhore.acquire();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        e.execute(new PrintThird());

        e.shutdown();
    }
}
