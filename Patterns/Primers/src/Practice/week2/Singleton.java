package Practice.week2;

public class Singleton {
    private static Singleton instance;
    private Singleton(){};

    public static Singleton getInstanse(){
        if (instance==null){
           instance = new Singleton();
        }
        return instance;
    }
}