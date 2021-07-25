package BehavioralPatterns.Command;

public class RunCommand implements Command{
    Hero hero;

    public RunCommand(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void execute() {
        hero.run();
    }
}
