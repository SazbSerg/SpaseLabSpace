package BehavioralPatterns.Visitor;

public class CrossFitBox implements FitnessCenter{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
