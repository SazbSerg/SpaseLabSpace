package BehavioralPatterns.Command;
//invoker
public class Player {
    Command run;
    Command stop;
    Command fire;
    public Player(Command run, Command stop, Command fire) {
        this.run = run;
        this.stop = stop;
        this.fire = fire;

    }
    void runHero(){
        run.execute();
    }
    void stopHero(){
        stop.execute();
    }
    void fireHero(){
        fire.execute();
    }
}
