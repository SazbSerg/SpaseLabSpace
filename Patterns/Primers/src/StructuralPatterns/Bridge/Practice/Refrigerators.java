package StructuralPatterns.Bridge.Practice;

public class Refrigerators extends VehicleType{
    public Refrigerators(Brand brand) {
        super(brand);
    }

    @Override
    void showVehicleType() {
        System.out.print("Я выбираю холодильник ");
        changeModel();
    }
}
