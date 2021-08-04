package BehavioralPatterns.Strategy;

public class PaymentStrategy {
    Payment payment;

    void setStrategy(Payment payment){
        this.payment = payment;
    }
    void performOperation(){
        payment.pay();
    }
}
