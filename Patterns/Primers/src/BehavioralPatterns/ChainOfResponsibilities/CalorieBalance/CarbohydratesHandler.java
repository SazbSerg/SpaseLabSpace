package BehavioralPatterns.ChainOfResponsibilities.CalorieBalance;

public class CarbohydratesHandler extends Handler{
   // public CarbohydratesHandler(int protein, int fat, int carbohydrate) {
     //   super(protein, fat, carbohydrate);
    //}
    public CarbohydratesHandler(){};

    @Override
    public void handlerManager() {
        System.out.println(Handler.carbohydrate/Handler.weight*100 + " % of carbos");
        counter++;
        System.out.println(counter);

    }
}
