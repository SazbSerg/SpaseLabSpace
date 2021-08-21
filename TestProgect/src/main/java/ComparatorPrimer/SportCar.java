package ComparatorPrimer;

public class SportCar {
    private String sportCarModel;
    private String color;
    private int price;
    private int power;

    public SportCar(String sportCarModel, String color, int price, int power) {
        this.sportCarModel = sportCarModel;
        this.color = color;
        this.price = price;
        this.power = power;
    }

    public String getSportCarModel() {
        return sportCarModel;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "sportCarModel='" + sportCarModel + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + '\'' +
                ", power= " + power + " Watt" + + '\'';
    }
}
