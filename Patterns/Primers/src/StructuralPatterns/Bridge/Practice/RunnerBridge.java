package StructuralPatterns.Bridge.Practice;

public class RunnerBridge {
    public static void main(String[] args) {
        VehicleType vehicleType = new Conditioners(new Samsung());
        vehicleType.showVehicleType();

        VehicleType vehicleType1 = new TVsets(new Philips());
        vehicleType1.showVehicleType();

        VehicleType vehicleType2 = new Refrigerators(new Sony());
        vehicleType2.showVehicleType();


    }
}
