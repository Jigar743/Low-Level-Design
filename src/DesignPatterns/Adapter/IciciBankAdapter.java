package DesignPatterns.Adapter;

public class IciciBankAdapter implements BankApiAdapter{
    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public boolean sendMoney() {
        return false;
    }
}
