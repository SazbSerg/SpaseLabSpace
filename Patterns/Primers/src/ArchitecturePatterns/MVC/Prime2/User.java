package ArchitecturePatterns.MVC.Prime2;

public class User {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();

        System.out.println();

        controller.validate(2, 30, "Nancy", "nansy@mail.ru");


    }
}
