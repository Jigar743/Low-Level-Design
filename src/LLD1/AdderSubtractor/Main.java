package LLD1.AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        count.value = 0;

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);


        // with this both approach there is a problem of data synchronization due to shared variables.
        // 1.
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(adder);
        executorService.execute(subtractor);

        executorService.shutdown();

        try {
            executorService.awaitTermination(100, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 2.
//        Thread adderThread = new Thread(adder);
//        Thread subtractorThread = new Thread(subtractor);
//
//        adderThread.start();
//        subtractorThread.start();
//
//
//        try {
//            adderThread.join(); // Wait for adder thread to finish
//            subtractorThread.join(); // Wait for subtractor thread to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(count.value);

    }
}
