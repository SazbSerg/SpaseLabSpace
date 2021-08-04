package BehavioralPatterns.Command;

//receiver
public class Hero {
    void run(){
        System.out.println("Run");
    }
    void stop(){
        System.out.println("Stop");
    }
    void fire(){
        System.out.println("Fire");

    }
}
