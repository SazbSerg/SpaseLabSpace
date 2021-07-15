package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.ChildrensBirthdayParty.ChildrensBirthdayPartyTeamFactory;
import CreationalPatterns.AbstractFactory.Сonference.ConferenceTaem;

public class Conference {
    public static void main(String[] args) {
        EventTeamFactory eventTeamFactory = new ConferenceTaem();
        Managering manager = eventTeamFactory.getManager();
        Cooking cook = eventTeamFactory.getCook();
        Waitering waiter = eventTeamFactory.getWaiter();

        manager.manageTeam();
        cook.toCook();
        waiter.postOrders();
    }
}
