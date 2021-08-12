package BehavioralPatterns.ChainOfResponsibilities.NewCode;

public class ConcreteHandler1 implements Handler{
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleMessage(int i) {
        if (i==0){
            System.out.println("Ваше число = 0");

        } if (nextHandler != null) {
            nextHandler.handleMessage(i);
        } else {
            System.out.println("Задайте следующий обработчик");
        }
    }
}
