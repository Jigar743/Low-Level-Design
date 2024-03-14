package DesignPatterns.Decorator;

public class Mocha implements Beverages{
    Beverages cb;
    Mocha(Beverages b){
        this.cb = b;
    }
    @Override
    public double getCost() {
        return 25 + cb.getCost();
    }
}
