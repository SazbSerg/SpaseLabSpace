package BehavioralPatterns.ChainOfResponsibilities.NewCode;

public class ConcreteHandler2 implements Handler{
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleMessage(int i) {
        if ( i > 0) {
            System.out.println("Ваше число положительное");
        } else {
            nextHandler.handleMessage(i);
        }
    }
}
