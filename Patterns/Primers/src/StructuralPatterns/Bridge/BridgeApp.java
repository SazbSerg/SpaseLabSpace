package StructuralPatterns.Bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Car car = new Sedan(new Chevrolet());
        car.showInfo();
        System.out.println();
        Car car1 = new Sedan(new Nissan());
        car1.showInfo();
        System.out.println();
        Car car2 = new Hatchback(new Chevrolet());
        car2.showInfo();
    }
}
