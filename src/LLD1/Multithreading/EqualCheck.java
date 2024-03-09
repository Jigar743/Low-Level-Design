package LLD1.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EqualCheck {
    private int val;
    private Object obj;

    public EqualCheck(int val){
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EqualCheck other = (EqualCheck) obj;
        return val == other.val;
    }

    public static void main(String[] args) {
        EqualCheck eq1 = new EqualCheck(10);
        EqualCheck eq2 = new EqualCheck(20);

        System.out.println(eq1 == eq2); // Outputs: false (different memory locations)
        System.out.println(eq1.equals(eq2)); // Outputs: false (default behavior, not overridden)

//        try{
//            long l = 100;
//            Thread.sleep(l);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach(System.out::println);
    }
}
