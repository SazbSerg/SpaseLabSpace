package BehavioralPatterns.Visitor;

public class FItnessApp {
    public static void main(String[] args) {
        FitnessCenter gym = new Gym();
        FitnessCenter swimmigPoll = new SwimmingPoll();
        FitnessCenter crossFitBox = new CrossFitBox();

        Visitor fitnessBaby = new FitnessBaby();
        Visitor someOldMan = new SomeOldMan();
        Visitor crossfitAthlete = new CrossFitAthlete();

        System.out.println("Что происходит в тренажёрном зале?");
        gym.accept(fitnessBaby);
        gym.accept(someOldMan);
        gym.accept(crossfitAthlete);
        System.out.println();

        System.out.println("Что происходит в бассейне?");
        swimmigPoll.accept(fitnessBaby);
        swimmigPoll.accept(someOldMan);
        swimmigPoll.accept(crossfitAthlete);
        System.out.println();

        System.out.println("Что происходит в кроссфит зале?");
        crossFitBox.accept(fitnessBaby);
        crossFitBox.accept(someOldMan);
        crossFitBox.accept(crossfitAthlete);
    }
}
