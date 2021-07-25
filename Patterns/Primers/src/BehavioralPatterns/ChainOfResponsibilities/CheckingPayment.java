package BehavioralPatterns.ChainOfResponsibilities;

public class CheckingPayment extends Checking {
    public CheckingPayment(int priority) {
        super(priority);
    }

    @Override
    public void write() {
        System.out.println("Выбор способа оплаты");
        counter++;
        System.out.println(counter);
    }
}
