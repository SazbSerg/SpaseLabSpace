package BehavioralPatterns.TemplateMethod;

public abstract class TemplateUsers {
    void info(){
        System.out.println("Введите ФИО: " + fio());
        System.out.println("Введите данные паспорта: " + passport());
        System.out.println("=====================================");
    }
    abstract String fio();
    abstract String passport();
}
