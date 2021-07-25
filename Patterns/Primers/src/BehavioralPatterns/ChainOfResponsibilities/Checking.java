package BehavioralPatterns.ChainOfResponsibilities;

public abstract class Checking {
    private int priority;
    private Checking nextStage;
    static int counter = 0;

    public Checking(int priority){
       this.priority = priority;
    }


    public  void setNextStage(Checking nextStage){
        this.nextStage = nextStage;
    }
    public void checkManager(int level){
        if(level >= priority){
            write();
        }
        if (nextStage != null){
            nextStage.checkManager(level);
        }

    }
    public abstract void write();

}
