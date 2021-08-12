package BehavioralPatterns.Command.Practice;

public class FryCommand implements Command{
    Meat meat;

    public FryCommand(Meat meat) {
        this.meat = meat;
    }

    @Override
    public void execute() {
        meat.fry();
    }
}
