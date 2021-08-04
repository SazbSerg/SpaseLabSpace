package BehavioralPatterns.Strategy;

public class CardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Оплата банковской картой");
    }
}
