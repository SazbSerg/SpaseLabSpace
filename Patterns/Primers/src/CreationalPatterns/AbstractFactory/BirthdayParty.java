package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.ChildrensBirthdayParty.ChildrensBirthdayPartyTeamFactory;
import CreationalPatterns.AbstractFactory.ChildrensBirthdayParty.Manager;
import CreationalPatterns.AbstractFactory.Wedding.WeddingTeam;
import CreationalPatterns.AbstractFactory.Сonference.ConferenceTaem;

public class BirthdayParty {
    public static void main(String[] args) {
        EventTeamFactory eventTeamFactory = new ChildrensBirthdayPartyTeamFactory();
        Managering manager = eventTeamFactory.getManager();
        Cooking cook = eventTeamFactory.getCook();
        Waitering waiter = eventTeamFactory.getWaiter();

        manager.manageTeam();
        cook.toCook();
        waiter.postOrders();
    }
}
