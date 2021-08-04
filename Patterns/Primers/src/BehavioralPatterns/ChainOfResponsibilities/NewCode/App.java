package BehavioralPatterns.ChainOfResponsibilities.NewCode;

public class App {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        concreteHandler1.setNextHandler(new ConcreteHandler2());
        concreteHandler1.handleMessage(0);

      //  System.out.println(ConcreteHandler1.count);
    }
}
