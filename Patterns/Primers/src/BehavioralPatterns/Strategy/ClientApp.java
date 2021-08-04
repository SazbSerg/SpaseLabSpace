package BehavioralPatterns.Strategy;

public class ClientApp {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new PaymentStrategy();
        paymentStrategy.setStrategy(new CardPayment());
        paymentStrategy.performOperation();

        paymentStrategy.setStrategy(new CashPayment());
        paymentStrategy.performOperation();

        paymentStrategy.setStrategy(new BitcoinPayment());
        paymentStrategy.performOperation();
    }
}
