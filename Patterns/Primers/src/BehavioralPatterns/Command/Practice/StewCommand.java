package BehavioralPatterns.Command.Practice;

public class StewCommand implements Command{
    Meat meat;

    public StewCommand(Meat meat) {
        this.meat = meat;
    }

    @Override
    public void execute() {
        meat.stew();
    }
}
