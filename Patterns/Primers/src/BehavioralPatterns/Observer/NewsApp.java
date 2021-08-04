package BehavioralPatterns.Observer;

public class NewsApp {
    public static void main(String[] args) {
        NewsChannel newsChannel = new NewsChannel();

        Observers firstSubscriber = new Subscriber("John Pone");
        Observers secondSubscriber = new Subscriber("Ann Pone");
        newsChannel.addSubscriber(firstSubscriber);
        newsChannel.addSubscriber(secondSubscriber);

        newsChannel.addPost("Всем привет, это первая новость на нашем канале!");
        newsChannel.removeSubscriber(firstSubscriber);
        newsChannel.removePost();
        System.out.println();
        newsChannel.addPost("К сожалению, Джон Поун покинул нас.");

    }
}
