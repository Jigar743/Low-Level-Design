package LLD1.MergeSortWithMultiThreading;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Integer> list = List.of(10, 5, 3, 9, 12, 2, 1, -6);
        Sorter sorter = new Sorter(list, executorService);

        Future<List<Integer>> sortedArray = executorService.submit(sorter);
        System.out.println(sortedArray.get());
    }
}
