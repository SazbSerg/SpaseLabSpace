package StructuralPatterns.Composite;

public class CompositeApp {
    public static void main(String[] args) {
        Basket fruit1 = new Fruits();
        Basket fruit2 = new Fruits();
        Basket fruit3 = new Fruits();

        Basket water1 = new Water();
        Basket water2 = new Water();
        Basket water3 = new Water();

        Basket meat1 = new Meat();
        Basket meat2 = new Meat();
        Basket meat3 = new Meat();

        Composite composite1 = new Composite();
        composite1.addComponent(fruit1);
        composite1.addComponent(meat1);
        composite1.addComponent(water1);
        composite1.put();
        System.out.println();
        composite1.removeComponent(fruit1);
        composite1.put();
        System.out.println();

       Composite composite2 = new Composite();
       Composite composite3 = new Composite();
       composite2.addComponent(composite1);
       composite3.addComponent(composite2);
       composite3.put();

    }
}
