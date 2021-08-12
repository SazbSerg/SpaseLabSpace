package BehavioralPatterns.Command.Practice;

public class BoilCommand implements Command{
    Meat meat;

    public BoilCommand(Meat meat) {
        this.meat = meat;
    }

    @Override
    public void execute() {
        meat.boil();
    }
}
