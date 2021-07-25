package BehavioralPatterns.Command;

public class FireCommand implements Command{
    Hero hero;

    public FireCommand(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void execute() {
        hero.fire();
    }
}
