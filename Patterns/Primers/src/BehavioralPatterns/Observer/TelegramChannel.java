package BehavioralPatterns.Observer;

public interface TelegramChannel {
    void addSubscriber(Observers observers);
    void removeSubscriber(Observers observers);
    void notifySubscribers();
}
