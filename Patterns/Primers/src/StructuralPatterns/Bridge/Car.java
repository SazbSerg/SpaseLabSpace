package StructuralPatterns.Bridge;

public abstract class Car {
    Model model;
    public Car(Model queryModel){
        model = queryModel;
    }
    abstract void showInfo();
}
