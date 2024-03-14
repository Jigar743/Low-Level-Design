package DesignPatterns.Adapter;

public class PhonePe {
    private BankApiAdapter bankApi;

    public PhonePe(BankApiAdapter bankApiAdapter){
        this.bankApi = bankApiAdapter;
    }

    double doSomething(){
        double currentBalance = bankApi.getBalance();
        return currentBalance * 2;
    }
}
