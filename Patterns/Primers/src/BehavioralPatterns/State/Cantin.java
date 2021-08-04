package BehavioralPatterns.State;

public class Cantin {
    public static void main(String[] args) {
        Menu menu = new Breakfast();
        Eating eating = new Eating();

        eating.setMenu(menu);
        eating.issueOfOrder();

        eating.changeMenu(menu);
        eating.issueOfOrder();

    }
}
