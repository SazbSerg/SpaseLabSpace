package CreationalPatterns.Singletone;

public class Main {
    public static void main(String[] args) {
       Singleton singleton = Singleton.getInstance();
       Singleton singleton1 = Singleton.getInstance();
       Singleton singleton2 = Singleton.getInstance();
       System.out.println(singleton);
       System.out.println(singleton1);
       System.out.println(singleton2);

    }
}
//проверка связи