package LLD1.AdderSubtractor;

public class Subtractor implements Runnable{
    private Count count;
    public Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++){
            synchronized (count){
                this.count.value -= i;
            }
        }
    }
}
