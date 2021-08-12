package BehavioralPatterns.Command.Practice;

public class App {
    public static void main(String[] args) {
        Meat meat = new Meat();

        Cook cook = new Cook(new FryCommand(meat), new BoilCommand(meat), new BakeCommand(meat), new StewCommand(meat));
        cook.fryMeat();
        cook.boilMeat();
        cook.bakeMeat();
        cook.stewMeat();
    }
}
