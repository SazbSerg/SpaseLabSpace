package BehavioralPatterns.ChainOfResponsibilities;

public class CheckingDelivery extends Checking {
    public CheckingDelivery(int priority) {
        super(priority);
    }

    @Override
    public void write() {
        System.out.println("Выбор способа доставки");
        counter++;
        System.out.println(counter);
    }
}
