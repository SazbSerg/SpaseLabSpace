package BehavioralPatterns.ChainOfResponsibilities.CalorieBalance;

public abstract class Handler {
    public Handler nextStage;
    static protected double protein;
    static protected double fat;
    static protected double carbohydrate;
    static protected double weight;
    static int counter = 0;

    public  void setNextStage1(Handler nextStage){
        this.nextStage = nextStage;
    }

    public Handler(int protein, int fat, int carbohydrate){
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.weight = protein + fat + carbohydrate;
    }
    public Handler(){
    }

    public abstract void handlerManager();
    {
    }
}
