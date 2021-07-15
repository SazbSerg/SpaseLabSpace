package Practice.week2;

public class Singleton2App {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInst();
        Singleton2 singleton21 = Singleton2.getInst();
        System.out.println(singleton21);
        System.out.println(singleton2);
    }
}
