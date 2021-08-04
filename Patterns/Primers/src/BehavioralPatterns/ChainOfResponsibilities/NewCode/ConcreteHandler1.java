package BehavioralPatterns.ChainOfResponsibilities.NewCode;

public class ConcreteHandler1 implements Handler{
    private Handler nextHandler;
   // public static int count = 1;

    @Override
    public void handleMessage(int i) {
        if (i==0){
            System.out.println("Ваше число = 0");

        } else {
            Handler handler2 = nextHandler;
            handler2.handleMessage(i);
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
