package BehavioralPatterns.Observer;

public class Subscriber implements Observers{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handlePost(String post) {
        System.out.println(name + ", we have fresh news for you: '" + post + "'");
    }
}
