package ArchitecturePatterns.MVC;

public class View {
    public void showData(Data data){
        System.out.println("Id: " + data.getId());
        System.out.println("name: " + data.getName());
        System.out.println("e-mail: " + data.getEmail());
    }
}
