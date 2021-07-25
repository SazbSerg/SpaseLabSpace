package BehavioralPatterns.ChainOfResponsibilities.CalorieBalance;

public class FatHandler extends Handler{
   // public FatHandler(int protein, int fat, int carbohydrate) {
      //  super(protein, fat, carbohydrate);
   // }
    public FatHandler(){};
    @Override
    public void handlerManager() {
        System.out.println(fat/weight*100 + " % of fats");
        nextStage.handlerManager();
        counter++;
        System.out.println(counter);
    }
}
