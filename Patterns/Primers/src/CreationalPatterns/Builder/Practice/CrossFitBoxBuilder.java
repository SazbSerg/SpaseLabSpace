package CreationalPatterns.Builder.Practice;

public class CrossFitBoxBuilder {
    private Cardio rower = Cardio.DEFAULT;
    private Cardio airBike = Cardio.DEFAULT;
    private Cardio skierg = Cardio.DEFAULT;
    private Cardio bikeErg = Cardio.DEFAULT;
    private Cardio airRunner = Cardio.DEFAULT;
    private FreeWeightEquipment barbell = FreeWeightEquipment.DEFAULT;
    private FreeWeightEquipment kettlebell = FreeWeightEquipment.DEFAULT;
    private FreeWeightEquipment dumbbell = FreeWeightEquipment.DEFAULT;
    private FreeWeightEquipment medball = FreeWeightEquipment.DEFAULT;

    CrossFitBoxBuilder RowerBuilder(Cardio rower) {
        this.rower = rower;
        return this;
    }

    CrossFitBoxBuilder AirBikeBuilder(Cardio airBike) {
        this.airBike = airBike;
        return this;
    }

    CrossFitBoxBuilder BikeErgBuilder(Cardio bikeErg) {
        this.bikeErg = bikeErg;
        return this;
    }

    CrossFitBoxBuilder AirRunnerBuilder(Cardio airRunner) {
        this.airRunner = airRunner;
        return this;
    }

    CrossFitBoxBuilder SkiergBuilder(Cardio skierg) {
        this.skierg = skierg;
        return this;
    }

    CrossFitBoxBuilder BarbellBuilder(FreeWeightEquipment barbell) {
        this.barbell = barbell;
        return this;
    }

    CrossFitBoxBuilder KettlebellBuilder(FreeWeightEquipment kettlebell) {
        this.kettlebell = kettlebell;
        return this;
    }

    CrossFitBoxBuilder DumbbellBuilder(FreeWeightEquipment dumbbell) {
        this.dumbbell = dumbbell;
        return this;
    }

    CrossFitBoxBuilder MedballBuilder(FreeWeightEquipment medball) {
        this.medball = medball;
        return this;
    }

    CrossFitBox build(){
        CrossFitBox crossFitBox = new CrossFitBox();
        crossFitBox.setRower(rower);
        crossFitBox.setAirBike(airBike);
        crossFitBox.setBikeErg(bikeErg);
        crossFitBox.setAirRunner(airRunner);
      //  crossFitBox.setSkierg(skierg);
       // crossFitBox.setBarbell(barbell);
       // crossFitBox.setMedball(medball);
       // crossFitBox.setKettlebell(kettlebell);
       // crossFitBox.setDumbbell(dumbbell);
        return crossFitBox;
    }


}
