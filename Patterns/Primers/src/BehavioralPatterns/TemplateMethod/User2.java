package BehavioralPatterns.TemplateMethod;

public class User2 extends TemplateUsers {
    @Override
    String fio() {
        return "Термилов Антон Акперович";
    }
    @Override
    String passport() {
        return "КМ 932234";
    }
}
