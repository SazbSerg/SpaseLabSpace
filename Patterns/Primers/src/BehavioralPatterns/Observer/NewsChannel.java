package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements TelegramChannel{
    private String post;
    private List<Observers> subscribers = new ArrayList<>();

    public void addPost(String post){
        this.post = post;
        notifySubscribers();
    }
    public void removePost(){
        this.post = null;
    }
    @Override
    public void addSubscriber(Observers observer) {
        this.subscribers.add(observer);

    }

    @Override
    public void removeSubscriber(Observers observer) {
        this.subscribers.remove(observer);

    }

    @Override
    public void notifySubscribers() {
        for(Observers observers: subscribers){
            observers.handlePost(this.post);
        }

    }
}
