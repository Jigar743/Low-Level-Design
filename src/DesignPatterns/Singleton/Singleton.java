package DesignPatterns.Singleton;

public class Singleton {
    private static Singleton singleton = null;


    private Singleton() {
        // do what ever logic you want to implement.
        System.out.println("I was called!");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            // double checking
            synchronized (Singleton.class) {
                if (singleton == null) singleton = new Singleton();
            }
        }
        return singleton;
    }
}
