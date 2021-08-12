package BehavioralPatterns.ChainOfResponsibilities.NewCode;

public class ConcreteHandler3 implements Handler{
    @Override
    public void handleMessage(int i) {
        if ( i < 0) {
            System.out.println("Ваше число отрицательное");
        }
    }
}
