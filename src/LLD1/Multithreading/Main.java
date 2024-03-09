package LLD1.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class B implements Runnable {

    int n;

    public B(int n) {
        this.n = n;
    }

    Lock lock = new ReentrantLock();

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (n + i));
        }
    }
}

public class Main {
     static volatile int a = 0, b = 0;

    static void inc(){
        a++;
        b++;
    }

    static void showVolatile(){
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
//        System.out.println(("From LLD1.Multithreading package!"));
//        ExecutorService e = Executors.newSingleThreadExecutor();
//
//        for (int i = 0; i < 100; i++) {
//            e.execute(new NumberPrinter(i));
////            Thread t = new Thread(new NumberPrinter(i));
//
//            // with this it will not print the numbers in sequentially.
////            t.start();
////            t.run();
//
////            NumberPrinter t = new NumberPrinter(i);
//        }
//
//        e.shutdown();

//        B b = new B(0);
//
//        Thread t1 = new Thread(b);
//        Thread t2 = new Thread(b);
//        t1.start();
//        t2.start();
//
//        t1.setName("From Thread A");
//        t2.setName("From Thread B");

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                inc();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                showVolatile();
        });

        t1.start();
        t2.start();
    }
}
