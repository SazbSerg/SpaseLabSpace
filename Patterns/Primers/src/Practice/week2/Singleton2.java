package Practice.week2;

public class Singleton2 {
    private static Singleton2 inst;
    private Singleton2(){};
    public static Singleton2 getInst(){
        if (inst == null){
            inst = new Singleton2();
        }
        return inst;
    }
}
