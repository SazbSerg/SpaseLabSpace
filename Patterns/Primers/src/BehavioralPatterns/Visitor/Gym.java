package BehavioralPatterns.Visitor;

public class Gym implements FitnessCenter{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
