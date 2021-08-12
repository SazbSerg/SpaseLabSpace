package CreationalPatterns.Builder.Practice2;

public class Car {
String frame;
String wheels;
String engine;
String transmission;

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "frame='" + frame + '\'' +
                ", wheels='" + wheels + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
