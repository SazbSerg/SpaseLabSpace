package CreationalPatterns.AbstractFactory.Сonference;

import CreationalPatterns.AbstractFactory.Cooking;
import CreationalPatterns.AbstractFactory.EventTeamFactory;
import CreationalPatterns.AbstractFactory.Managering;
import CreationalPatterns.AbstractFactory.Waitering;

public class ConferenceTaem implements EventTeamFactory {
    @Override
    public Managering getManager() {
        return new Manager();
    }

    @Override
    public Cooking getCook() {
        return new Cook();
    }

    @Override
    public Waitering getWaiter() {
        return new Waiter();
    }
}
