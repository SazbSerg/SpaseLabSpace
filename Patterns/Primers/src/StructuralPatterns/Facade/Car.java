package StructuralPatterns.Facade;

public class Car {
    Engine engine = new Engine();
    Transmission transmission = new Transmission();

    public void drive(){
        engine.start();
        transmission.shift();
        System.out.println("Автомобиль едит");
    }
}
