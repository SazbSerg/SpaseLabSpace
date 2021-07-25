package BehavioralPatterns.Command;

public class StopCommand implements Command{
    Hero hero;

    public StopCommand(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void execute() {
        hero.stop();
    }
}
