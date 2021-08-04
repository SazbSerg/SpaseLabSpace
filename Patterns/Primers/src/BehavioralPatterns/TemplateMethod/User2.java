package BehavioralPatterns.TemplateMethod;

public class User2 extends TemplateUsers {
    @Override
    void fio() {
        System.out.println("Термилов Антон Акперович");
    }
    @Override
    void passport() {
        System.out.println("КМ 932234");
    }
}
