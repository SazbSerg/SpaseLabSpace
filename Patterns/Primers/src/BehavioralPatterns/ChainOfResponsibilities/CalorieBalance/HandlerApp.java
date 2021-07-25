package BehavioralPatterns.ChainOfResponsibilities.CalorieBalance;

public class HandlerApp {
    public static void main(String[] args) {
        Handler handler = new ProteinHandler(20,30,50);
        Handler handler1 = new FatHandler();
        Handler handler2 = new CarbohydratesHandler();
        handler.setNextStage1(handler1);
        handler1.setNextStage1(handler2);

      //  handler.handlerManager();
       // System.out.println();
       // handler1.handlerManager();
        //System.out.println();
        handler2.handlerManager();
        System.out.println();
    }
}
