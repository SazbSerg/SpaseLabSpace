package BehavioralPatterns.ChainOfResponsibilities;

public class CheckingBalance extends Checking {
    public CheckingBalance(int priority) {
        super(priority);
    }

    @Override
    public void write() {
        System.out.println("Проверка баланса");
        counter++;
        System.out.println(counter);
    }
}
