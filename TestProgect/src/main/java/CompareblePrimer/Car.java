package CompareblePrimer;

public class Car implements Comparable<Car>{
    private String carModel;
    private String color;
    private int price;

    public Car(String carModel, String color, int price) {
        this.carModel = carModel;
        this.color = color;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price;
    }


    @Override
    public int compareTo(Car anotherCar) {
        if (this.price == anotherCar.price){
            return 0;
        } else if (this.price < anotherCar.price) {
            return -1;
        } else {
        return 1;
        }
    }
}
