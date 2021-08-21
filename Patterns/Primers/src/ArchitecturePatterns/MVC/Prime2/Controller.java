package ArchitecturePatterns.MVC.Prime2;

public class Controller {
    private View view = new View();
    private Model model = new Model();

    void execute(){
        view.showData(model.getData());
    }

    void validate(int id, int age, String name, String email){
        model.setData(id, age, name, email);
        execute();
    }
}
