package TestOfInterfaces;

public class Raketa implements Vzliot{
    @Override
    public void verticalVzliot() {
        System.out.println("Вертикальный взлёт ракета");
    }
    @Override
    public void verticalPosadka(){
        System.out.println("Вертикальная посадка ракеты");
    }
}
