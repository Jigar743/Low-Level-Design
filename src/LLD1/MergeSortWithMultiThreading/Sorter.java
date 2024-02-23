package LLD1.MergeSortWithMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private final List<Integer> values;
    private final ExecutorService executorService;

    public Sorter(List<Integer> array, ExecutorService es){
        this.values = array;
        this.executorService = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(values.size() <= 1){
            return values;
        }

        int mid = values.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        for(int i = 0; i< mid; i++){
            leftArray.add(values.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i = mid; i< values.size(); i++){
            rightArray.add(values.get(i));
        }

        Sorter leftSorter = new Sorter(leftArray, executorService);
        Sorter rightSorter = new Sorter(rightArray, executorService);

        Future<List<Integer>> leftSorterFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSorterFuture = executorService.submit(rightSorter);

        return merge(leftSorterFuture.get(), rightSorterFuture.get());
    }

    public List<Integer> merge(List<Integer> array1, List<Integer> array2){
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while(i < array1.size() && j < array2.size()){
            if(array1.get(i) < array2.get(j)){
                result.add(array1.get(i));
                i++;
            }else{
                result.add(array2.get(j));
                j++;
            }
        }

        while (i < array1.size()){
            result.add(array1.get(i));
            i++;
        }

        while (j < array2.size()){
            result.add(array2.get(j));
            j++;
        }

        return result;
    }
}
