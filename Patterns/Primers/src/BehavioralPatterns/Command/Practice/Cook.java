package BehavioralPatterns.Command.Practice;

public class Cook {
Command fry;
Command boil;
Command bake;
Command stew;

    public Cook(Command fry, Command boil, Command bake, Command stew) {
        this.fry = fry;
        this.boil = boil;
        this.bake = bake;
        this.stew = stew;
    }
    void fryMeat(){
        fry.execute();
    }
    void boilMeat(){
        boil.execute();
    }
    void bakeMeat(){
        bake.execute();
    }
    void stewMeat(){
        stew.execute();
    }
}
