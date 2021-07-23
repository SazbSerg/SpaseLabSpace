package StructuralPatterns.Bridge;

public class Hatchback extends Car{
    public Hatchback(Model queryModel) {
        super(queryModel);
    }
    void showInfo(){
        System.out.println("Hatchback");
        model.setModel();
    }
}
