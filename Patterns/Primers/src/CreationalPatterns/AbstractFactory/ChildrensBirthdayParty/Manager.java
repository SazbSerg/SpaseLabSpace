package CreationalPatterns.AbstractFactory.ChildrensBirthdayParty;

import CreationalPatterns.AbstractFactory.Managering;

public class Manager implements Managering {
    @Override
    public void manageTeam() {
        System.out.println("Управлять детским днём рождения");
    }
}
