package StructuralPatterns.Bridge.Practice;

public class TVsets extends VehicleType{

    public TVsets(Brand brand) {
        super(brand);
    }

    @Override
    void showVehicleType() {
        System.out.print("Я выбираю телевизор ");
        changeModel();
    }
}
