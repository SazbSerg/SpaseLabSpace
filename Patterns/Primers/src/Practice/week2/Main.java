package Practice.week2;

public class Main {
    public static void main(String[] args) {
        Telek telek = new Telek("20x30", "black");
        Object copyTelek = telek.copyCopy();
        System.out.println(telek);
        System.out.println(copyTelek);

    }
}
