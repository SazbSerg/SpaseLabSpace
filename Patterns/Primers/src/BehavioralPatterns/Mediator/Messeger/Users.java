package BehavioralPatterns.Mediator.Messeger;

public interface Users {
    void sendMessage(String message, Users user);
    void getMessage(String message, Users user);
}

