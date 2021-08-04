package BehavioralPatterns.TemplateMethod;

public class User1 extends TemplateUsers {

    @Override
    void fio() {
        System.out.println("Коэльо Камилла Ивановна");
    }

    @Override
    void passport() {
        System.out.println("КМ 912314");
    }
}
