package BehavioralPatterns.Visitor;

public interface Visitor {
    void visit(Gym visitor);
    void visit(SwimmingPoll visitor);
    void visit(CrossFitBox visitor);
}
