package CreationalPatterns.Prototype;

public class Car implements CopyObjects {
    String color;
    int power;
    String engineType;

    public Car(String color, int power, String engineType) {
        this.color = color;
        this.power = power;
        this.engineType = engineType;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car: " +
                "color '" + color + '\'' +
                ", power " + power +
                ", engineType '" + engineType + '\'';
    }

    @Override
    public Object copy() {
        Car copy = new Car(this.color, this.power, this.engineType);
        return copy;

    }
}
