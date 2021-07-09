package TestOfInterfaces;

public class Vertolot implements Vzliot{
    @Override
    public void verticalVzliot() {
        System.out.println("Вертикальный взлёт вертолёта");
    }

    @Override
    public void verticalPosadka() {
        System.out.println("Вертикальная посадка вертолёта");
    }
}
