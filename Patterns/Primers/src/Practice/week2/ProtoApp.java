package Practice.week2;

public class ProtoApp {
    public static void main(String[] args) {
        Skovorodka skovorodka = new Skovorodka("red", "iron",  3);
        System.out.println(skovorodka);
        Object skovorodka1 = skovorodka.cloneCopy();
        System.out.println(skovorodka1);
    }
}
