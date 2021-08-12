package CreationalPatterns.Builder.Practice2;

public class CarBuilder {
    String frame;
    String wheels;
    String engine;
    String transmission;

    CarBuilder frameBuilder(String frame){
        this.frame = frame;
        return this;
    }

    CarBuilder wheelsBuilder(String wheels){
        this.wheels = wheels;
        return this;
    }

    CarBuilder engineBuilder(String engine){
        this.engine = engine;
        return this;
    }

    CarBuilder transmissionBuilder(String transmission){
        this.transmission = transmission;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setFrame(frame);
        car.setWheels(wheels);
        car.setEngine(engine);
        car.setTransmission(transmission);
        return car;
    }
}
