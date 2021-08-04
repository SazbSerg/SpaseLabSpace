package BehavioralPatterns.State;

public class Eating {
    Menu menu;

    public void setMenu(Menu menu){
        this.menu = menu;
    }

    public void changeMenu(Menu menu){
        if (menu instanceof Breakfast){
            setMenu(new Dinner());
        } else if (menu instanceof Dinner){
            setMenu(new Breakfast());
        }
    }

    public void issueOfOrder(){
        menu.issueOfOder();
    }
}
