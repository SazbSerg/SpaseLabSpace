package StructuralPatterns.Flyweight.NewCode;

public class DryCargo implements LogisticService {

    @Override
    public void deliver() {
        System.out.println("Доставить сухогруз");
    }
}
