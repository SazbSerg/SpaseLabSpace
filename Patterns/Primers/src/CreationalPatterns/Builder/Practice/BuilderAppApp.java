package CreationalPatterns.Builder.Practice;

public class BuilderAppApp {
    public static void main(String[] args) {
        CrossFitBox crossFitBox = new CrossFitBoxBuilder()

                .RowerBuilder(Cardio.ROWER)
                .BarbellBuilder(FreeWeightEquipment.BARBELL)
                .MedballBuilder(FreeWeightEquipment.MEDBALL)

                .build();
        System.out.println(crossFitBox);
    }
}
