package PatternsPractice;

public class ProtoApp {
    public static void main(String[] args) {
        Bem bem = new Bem("RED");
        CopyCopy bem1 = bem.copy();
        System.out.println(bem);

        System.out.println(bem1);
    }
}
