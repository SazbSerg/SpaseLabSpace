package StructuralPatterns.Flyweight.NewCode;

public class Containers implements LogisticService {
    @Override
    public void deliver() {
        System.out.println("Доставить груз в контейнерах");
    }
}
