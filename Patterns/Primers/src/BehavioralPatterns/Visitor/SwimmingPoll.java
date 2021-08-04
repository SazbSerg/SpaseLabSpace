package BehavioralPatterns.Visitor;

public class SwimmingPoll implements FitnessCenter{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
