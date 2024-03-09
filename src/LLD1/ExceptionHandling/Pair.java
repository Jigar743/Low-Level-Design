package LLD1.ExceptionHandling;

import java.util.Comparator;

public class Pair<LT extends Comparable<LT>, RT> implements Comparable<Pair<LT, RT>> {
    private LT left;
    private RT right;

    public Pair(LT leftEle, RT rightEle) throws ArithmeticException{
        throw new ArithmeticException("Number is not valid!");
//        this.left = leftEle;
//        this.right = rightEle;
    }

    public LT getLeft(){
        return this.left;
    }

    public RT getRight(){
        return this.right;
    }

    // previous is less than the current then -1
    // previous is greater than current then +1
    // if both equal then 0
    @Override
    public int compareTo(Pair<LT, RT> current) {
        return left.compareTo(current.left);
    }
}
