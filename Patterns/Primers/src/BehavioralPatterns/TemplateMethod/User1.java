package BehavioralPatterns.TemplateMethod;

public class User1 extends TemplateUsers {

    @Override
    String fio() {
        return "Коэльо Камилла Ивановна";
    }

    @Override
    String passport() {
        return "КМ 912314";
    }
}
