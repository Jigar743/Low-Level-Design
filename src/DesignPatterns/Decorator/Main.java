package DesignPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Beverages b = new DeCaf();

        b = new Mocha(b);
        b = new Whip(b);
        b = new Mocha(b);

        System.out.println(b.getCost());
    }
}
