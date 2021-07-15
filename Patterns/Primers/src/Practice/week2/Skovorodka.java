package Practice.week2;

public class Skovorodka implements CopyClone{
    String color;
    String material;
    int garanty;

    public Skovorodka(String color, String material, int garanty){
        this.color = color;
        this.material = material;
        this.garanty = garanty;
    }

    @Override
    public String toString() {
        return "Skovorodka{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", garanty=" + garanty +
                '}';
    }

    @Override
    public Object cloneCopy() {
        Skovorodka skovorodka = new Skovorodka(this.color, this.material, this.garanty);
        return skovorodka;
    }
}
