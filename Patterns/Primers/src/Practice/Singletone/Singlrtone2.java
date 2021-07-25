package Practice.Singletone;

public class Singlrtone2 {
    private static Singlrtone2 insttance;
    private Singlrtone2(){};

    public static Singlrtone2 getInstance(){
        if (insttance == null){
            insttance = new Singlrtone2();
        }
        return insttance;
    }
}
