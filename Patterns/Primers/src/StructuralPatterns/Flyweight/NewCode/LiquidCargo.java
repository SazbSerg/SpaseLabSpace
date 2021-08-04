package StructuralPatterns.Flyweight.NewCode;

public class LiquidCargo implements LogisticService {
    @Override
    public void deliver() {
        System.out.println("Доставить жидкий груз");
    }
}
