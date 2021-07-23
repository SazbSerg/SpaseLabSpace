package StructuralPatterns.Decorator;

public class SugarDecorator implements CoffeeOrder {
    CoffeeOrder sugar;
    Integer stick = null;
    final Integer maxNumberOfSugar = 5;

    public SugarDecorator(CoffeeOrder sugar, Integer stick) {
        this.sugar = sugar;
        this.stick = stick;
    }
    public SugarDecorator(CoffeeOrder sugar) {
        this.sugar = sugar;
    }

    @Override
    public void order() {
        sugar.order();

        if (stick == null){
            System.out.println("without sugar");
        } else if (stick == 1){
            System.out.println("with " + stick + " stick of sugar");
        } else if (stick >= maxNumberOfSugar){
        System.out.println("with " + maxNumberOfSugar + " sticks of sugar");
        } else {
            System.out.println("with " + stick + " sticks of sugar");
        }
    }
}
