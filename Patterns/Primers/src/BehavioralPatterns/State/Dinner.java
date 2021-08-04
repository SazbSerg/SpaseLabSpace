package BehavioralPatterns.State;

public class Dinner implements Menu{
    @Override
    public void issueOfOder() {
        System.out.println("Выдача ужина");
    }
}
