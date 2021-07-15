package CreationalPatterns.AbstractFactory.Wedding;

import CreationalPatterns.AbstractFactory.Managering;

public class Manager implements Managering {
    @Override
    public void manageTeam() {
        System.out.println("Управляю свадьбой");
    }
}
