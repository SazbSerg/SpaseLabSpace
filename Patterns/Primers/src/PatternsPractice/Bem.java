package PatternsPractice;

public class Bem implements CopyCopy{
    public String color;

    public Bem(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bem{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public CopyCopy copy() {
        Bem bem = new Bem(this.color);
        return bem;
    }


}
