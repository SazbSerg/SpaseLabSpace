package CreationalPatterns.Singletone.Practice;

public class SingleApp {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getIinstanse();
        singleton2.hashCode();
        System.out.println(singleton2.hashCode());

        Singleton2 singleton21 = Singleton2.getIinstanse();
        System.out.println(singleton21.hashCode());
    }
}
