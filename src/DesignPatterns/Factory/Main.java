package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.Button;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory factory = flutter.createUIfactory("Android");
        Button button = factory.createButton();
        button.setSize();
    }
}
