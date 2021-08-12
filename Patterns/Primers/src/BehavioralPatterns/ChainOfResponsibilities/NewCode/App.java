package BehavioralPatterns.ChainOfResponsibilities.NewCode;

public class App {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.setNextHandler(concreteHandler2);
        concreteHandler2.setNextHandler(new ConcreteHandler3());

        concreteHandler1.handleMessage(0);

    }
}
