package CreationalPatterns.AbstractFactory;

public interface EventTeamFactory {
    Managering getManager();
    Cooking getCook();
    Waitering getWaiter();
}
