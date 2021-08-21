package ArchitecturePatterns.MVC;

public class Controller {
    Model model = new Model();
    View view = new View();

    void execute(){
        view.showData(model.getData());

    }

}
