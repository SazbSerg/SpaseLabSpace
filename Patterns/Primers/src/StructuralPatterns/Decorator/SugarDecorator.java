package StructuralPatterns.Decorator;

public class SugarDecorator implements CoffeeOrder {
    private CoffeeOrder myCoffee;
    private Integer stick = null;
    private final Integer maxNumberOfSugar = 5;

    public SugarDecorator(CoffeeOrder myCoffee, Integer stick) {
        this.myCoffee = myCoffee;
        this.stick = stick;
    }
    public SugarDecorator(CoffeeOrder myCoffee) {
        this.myCoffee = myCoffee;
    }

    @Override
    public void order() {
        myCoffee.order();

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
