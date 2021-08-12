package StructuralPatterns.Bridge.Practice;

public class Conditioners extends VehicleType{
    public Conditioners(Brand brand) {
        super(brand);
    }

    @Override
    void showVehicleType() {
        System.out.print("Я выбираю кондиционер ");
        changeModel();
    }
}
