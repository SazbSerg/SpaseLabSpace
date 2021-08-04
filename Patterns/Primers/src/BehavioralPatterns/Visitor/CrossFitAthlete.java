package BehavioralPatterns.Visitor;

public class CrossFitAthlete implements Visitor{
    @Override
    public void visit(Gym visitor) {
        System.out.println("Кроссфит-атлет отработал беговую сессию на дорожке для бега");
    }

    @Override
    public void visit(SwimmingPoll visitor) {
        System.out.println("Кроссфит-атлет отработал технику плавания и интервальную работу");

    }

    @Override
    public void visit(CrossFitBox visitor) {
        System.out.println("Кроссфит-атлет отработал тренировку");
    }
}
