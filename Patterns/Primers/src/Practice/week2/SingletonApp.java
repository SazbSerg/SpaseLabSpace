package Practice.week2;

public class SingletonApp {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstanse();
        Singleton singleton2 = Singleton.getInstanse();
        Singleton singleton3 = Singleton.getInstanse();
        Singleton singleton4 = Singleton.getInstanse();

        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);

    }
}