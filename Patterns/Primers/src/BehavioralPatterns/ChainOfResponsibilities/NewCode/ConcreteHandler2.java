package BehavioralPatterns.ChainOfResponsibilities.NewCode;

public class ConcreteHandler2 implements Handler{

    @Override
    public void handleMessage(int i) {
        if ( i > 0) {
            System.out.println("Ваше число положительное");
        } else {
            System.out.println("Ваше число отрицательное");
        }
       // ConcreteHandler1.count++;
    }
}
