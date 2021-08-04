package BehavioralPatterns.State;

public class Breakfast implements Menu{
    @Override
    public void issueOfOder() {
        System.out.println("Выдача завтрака");
    }
}
