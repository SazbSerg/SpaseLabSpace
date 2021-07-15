package CreationalPatterns.AbstractFactory.Wedding;

import CreationalPatterns.AbstractFactory.Cooking;

public class Cook implements Cooking {
    @Override
    public void toCook() {
        System.out.println("Готовлю свадебное меню");
    }
}
