package BehavioralPatterns.Mediator.Messeger;

public class User implements Users{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message, Users user) {
        System.out.println(this.name + " отправил сообщение " + user + " '" + message + "'.");
        getMessage(message, user);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void getMessage(String message, Users user) {
        System.out.println(user + " получил сообщение от " + this.name + " '" + message + "'.");
    }
}
