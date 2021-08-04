package BehavioralPatterns.Visitor;

public class FitnessBaby implements Visitor{
    @Override
    public void visit(Gym visitor) {
        System.out.println("Фитоняшка прокачала ноги, попу, пресс. Сделала 3 селфи в зале, 1 в туалете, 2 в раздевалке");
    }

    @Override
    public void visit(SwimmingPoll visitor) {
        System.out.println("Фитоняшка чуток поплавала");

    }

    @Override
    public void visit(CrossFitBox visitor) {
        System.out.println("Фитноняшка зашла в зал, посмотрела, что нет зеркал, и вышла");

    }
}
