package BehavioralPatterns.Mediator.Messeger;

public class MessegerApp {
    public static void main(String[] args) {
        Users user1 = new User("Antony");
        Users user2 = new User("Jymmy");
        Users user3 = new User("Anna");

        user1.sendMessage("Привет", user2);
        user2.sendMessage("Привет! Я на связи!", user1);

    }
}
