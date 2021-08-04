package CreationalPatterns.Builder.Practice;

public class CrossFitBox {
    private Cardio rower, airBike, bikeErg, skierg, airRunner;
    private FreeWeightEquipment barbell, kettlebell, dumbbell, medball;

    public void setRower(Cardio rower) {
        this.rower = rower;
    }

    public void setAirBike(Cardio airBike) {
        this.airBike = airBike;
    }

    public void setBikeErg(Cardio bikeErg) {
        this.bikeErg = bikeErg;
    }

    public void setAirRunner(Cardio airRunner) {
        this.airRunner = airRunner;
    }

    public void setSkierg(Cardio skierg) {
        this.skierg = skierg;
    }

    public void setBarbell(FreeWeightEquipment barbell) {
        this.barbell = barbell;
    }

    public void setKettlebell(FreeWeightEquipment kettlebell) {
        this.kettlebell = kettlebell;
    }

    public void setDumbbell(FreeWeightEquipment dumbbell) {
        this.dumbbell = dumbbell;
    }

    public void setMedball(FreeWeightEquipment medball) {
        this.medball = medball;
    }

    @Override
    public String toString() {
        return "CrossFitBox{" +
                "rower=" + rower +
                ", airBike=" + airBike +
                ", bikeErg=" + bikeErg +
                ", airRunner=" + airRunner +
                ", skierg=" + skierg +
                ", barbell=" + barbell +
                ", kettlebell=" + kettlebell +
                ", dumbbell=" + dumbbell +
                ", medball=" + medball +
                '}';
    }
}
