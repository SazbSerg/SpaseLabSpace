package StructuralPatterns.Decorator;

public class Coffee implements CoffeeOrder {
TypeOfCoffee choice = TypeOfCoffee.DEFAULT;

    public Coffee(TypeOfCoffee choice) {
        this.choice = choice;
    }

    @Override
    public void order() {
        System.out.println();
        System.out.print(choice + " ");
    }
}
