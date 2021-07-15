package CreationalPatterns.AbstractFactory.Сonference;

import CreationalPatterns.AbstractFactory.Cooking;

public class Cook implements Cooking {
    @Override
    public void toCook() {
        System.out.println("Готовлю меню для конференции");
    }
}
