package LLD1.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println(("From LLD1.Multithreading package!"));
        ExecutorService e = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 100; i++) {
            e.execute(new NumberPrinter(i));
//            Thread t = new Thread(new NumberPrinter(i));

            // with this it will not print the numbers in sequentially.
//            t.start();
//            t.run();

//            NumberPrinter t = new NumberPrinter(i);
        }

        e.shutdown();
    }
}
