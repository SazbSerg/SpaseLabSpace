package StructuralPatterns.Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        CoffeeOrder coffeeOrder = new SugarDecorator(new Coffee(TypeOfCoffee.CAPPUCCINO));
        coffeeOrder.order();

        CoffeeOrder coffeeOrder1 = new SugarDecorator(new Coffee(TypeOfCoffee.AMERICANO), 3);
        coffeeOrder1.order();

        CoffeeOrder coffeeOrder2 = new SugarDecorator(new Coffee(TypeOfCoffee.LATTE), 2);
        coffeeOrder2.order();

        CoffeeOrder coffeeOrder3 = new SugarDecorator(new Coffee(TypeOfCoffee.CAPPUCCINO), 1);
        coffeeOrder3.order();

        CoffeeOrder coffeeOrder4 = new SugarDecorator(new Coffee(TypeOfCoffee.ESPRESSO), 100);
        coffeeOrder4.order();

        CoffeeOrder coffeeOrder5 = new SugarDecorator(new Coffee(TypeOfCoffee.AMERICANO),6);
        coffeeOrder5.order();


    }
}
