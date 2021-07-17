package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.ChildrensBirthdayParty.ChildrensBirthdayPartyTeamFactory;
import CreationalPatterns.AbstractFactory.Wedding.WeddingTeam;

public class WeddingParty {
    public static void main(String[] args) {
        EventTeamFactory eventTeamFactory = new WeddingTeam(); //создание новой команды мероприятия: свадьба, др или конф.
        Managering manager = eventTeamFactory.getManager();
        Cooking cook = eventTeamFactory.getCook();
        Waitering waiter = eventTeamFactory.getWaiter();

        manager.manageTeam();
        cook.toCook();
        waiter.postOrders();
        }
}
