package StructuralPatterns.Bridge;

public class Sedan extends Car{
    public Sedan(Model queryModel) {
        super(queryModel);
    }
    void showInfo(){
        System.out.println("Sedan");
        model.setModel();
    }
}
