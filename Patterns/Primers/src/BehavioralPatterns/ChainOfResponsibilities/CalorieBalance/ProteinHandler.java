package BehavioralPatterns.ChainOfResponsibilities.CalorieBalance;

public class ProteinHandler extends Handler {

    public ProteinHandler(int protein, int fat, int carbohydrate) {
        super(protein, fat, carbohydrate);
    }

    @Override
    public void handlerManager() {

        System.out.println(protein/weight*100 + " % of proteins");
        nextStage.handlerManager();
        counter++;
        System.out.println(counter);
    }
}
