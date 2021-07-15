package CreationalPatterns.AbstractFactory.ChildrensBirthdayParty;

import CreationalPatterns.AbstractFactory.Cooking;

public class Cook implements Cooking {
    @Override
    public void toCook() {
        System.out.println("Приготовить детское меню");
    }
}
