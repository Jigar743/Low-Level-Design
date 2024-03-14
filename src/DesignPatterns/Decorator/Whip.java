package DesignPatterns.Decorator;

public class Whip implements Beverages{
    Beverages cb;
    Whip(Beverages b){
        this.cb = b;
    }
    @Override
    public double getCost() {
        return 10 + cb.getCost();
    }
}
