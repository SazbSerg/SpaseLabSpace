package BehavioralPatterns.Command.Practice;

public class BakeCommand implements Command{
    Meat meat;

    public BakeCommand(Meat meat) {
        this.meat = meat;
    }

    @Override
    public void execute() {
        meat.bake();
    }
}
