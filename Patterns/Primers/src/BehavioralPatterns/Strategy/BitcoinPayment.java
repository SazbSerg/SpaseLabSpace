package BehavioralPatterns.Strategy;

public class BitcoinPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Оплата биткоином");
    }
}
