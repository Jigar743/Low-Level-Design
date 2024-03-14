package DesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        String useInput = "Icici";

        BankApiAdapter bankApiAdapter = new IciciBankAdapter();
        PhonePe accObj = new PhonePe(bankApiAdapter);
    }
}
