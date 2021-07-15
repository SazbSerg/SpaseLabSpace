package CreationalPatterns.AbstractFactory.ChildrensBirthdayParty;

import CreationalPatterns.AbstractFactory.Waitering;

public class Waiter implements Waitering {
    @Override
    public void postOrders() {
        System.out.println("Разносить еду на детском дне рождения");
    }
}
