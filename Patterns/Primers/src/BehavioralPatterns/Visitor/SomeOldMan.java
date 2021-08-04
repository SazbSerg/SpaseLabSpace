package BehavioralPatterns.Visitor;

public class SomeOldMan implements Visitor{
    @Override
    public void visit(Gym visitor) {
        System.out.println("Пожилой мужчина походил на дорожке, сделал несколько упражнений с лёгкими весами");
    }

    @Override
    public void visit(SwimmingPoll visitor) {
        System.out.println("Пожилой мужчина поплавал в удовольствие");

    }

    @Override
    public void visit(CrossFitBox visitor) {
        System.out.println("Пожилой мужчина не решился зайти, так как кроссфит - это тяжело, для молодых и т.д...");

    }
}
