package Factory;

public class WonderWoman implements Player{
    @Override
    public void going() {
        System.out.println("Чудо-женщина куда-то пошла");
    }

    @Override
    public void fire() {
        System.out.println("Чудо-женщина в кого-то стреляет");
    }

    @Override
    public void speaking() {
        System.out.println("Чудо-женщина что-то говорит");
    }
}
