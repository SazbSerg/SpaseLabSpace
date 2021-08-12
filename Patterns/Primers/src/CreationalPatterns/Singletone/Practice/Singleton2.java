package CreationalPatterns.Singletone.Practice;

public class Singleton2 {
    private static Singleton2 iinstanse;

    @Override
    public String toString() {
        return "Singleton2{}";
    }

    private Singleton2() {
    }

    public static Singleton2 getIinstanse(){
        if (iinstanse == null){
            iinstanse = new Singleton2();
        }
        return iinstanse;
    }
}
