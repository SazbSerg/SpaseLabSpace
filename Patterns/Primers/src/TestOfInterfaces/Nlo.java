package TestOfInterfaces;

public class Nlo implements Vzliot{
    @Override
    public void verticalVzliot() {
        System.out.println("Вертикальный взлёт НЛО");
    }
    @Override
    public void verticalPosadka(){
        System.out.println("Вертикальная посадка НЛО");
    }
}
