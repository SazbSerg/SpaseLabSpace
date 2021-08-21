package ArchitecturePatterns.MVC.Prime2;

public class View {

    void showData(DataBase model){
        System.out.println("Id: " + model.getId() + "\n" +
                           "Age: " + model.getAge() + "\n" +
                           "Name: " + model.getName() + "\n" +
                           "e-mail: " + model.getEmail());
    }
}
