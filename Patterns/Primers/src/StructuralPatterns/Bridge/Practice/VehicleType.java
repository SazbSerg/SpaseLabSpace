package StructuralPatterns.Bridge.Practice;

public abstract class VehicleType {
    Brand brand;

    public VehicleType(Brand brand) {
        this.brand = brand;
    }
    void changeModel(){
        brand.showBrand();
    }
    abstract void showVehicleType();

}
