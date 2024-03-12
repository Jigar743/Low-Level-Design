package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();

        Singleton s2 = Singleton.getSingleton();
    }
}
