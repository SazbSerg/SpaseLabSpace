package Practice.week2;

public class Telek implements CopyCopy {
    private String dimensions;
    private String color;

    public Telek(String dimensions, String color){
        this.dimensions = dimensions;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Telek{" +
                "dimensions='" + dimensions + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Object copyCopy() {
        Telek telek = new Telek(this.dimensions, this.color);
        return telek;
    }
}
