package CreationalPatterns.Singletone;

public class Vocabulary {
    private static Vocabulary info;
    private Vocabulary(){}

    public static Vocabulary getInfo(){
        if (info == null) {
            info = new Vocabulary();
        }
        return info;
    }
}
