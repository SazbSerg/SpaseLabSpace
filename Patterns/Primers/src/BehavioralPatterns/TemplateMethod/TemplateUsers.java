package BehavioralPatterns.TemplateMethod;

public abstract class TemplateUsers {
    void info(){
        System.out.print("Введите ФИО: ");
        fio();
        System.out.print("Введите данные паспорта: ");
        passport();
        System.out.println("=====================================");
    }
    abstract void fio();
    abstract void passport();
}
