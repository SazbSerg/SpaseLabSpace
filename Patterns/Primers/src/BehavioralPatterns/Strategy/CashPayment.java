package BehavioralPatterns.Strategy;

public class CashPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Оплата наличкой");
    }
}
