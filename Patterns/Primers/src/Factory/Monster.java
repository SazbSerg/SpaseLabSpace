package Factory;

public class Monster implements Player{
    @Override
    public void going() {
        System.out.println("Монстр куда-то пошёл");
    }

    @Override
    public void fire() {
        System.out.println("Монстр в кого-то стреляет");
    }

    @Override
    public void speaking() {
        System.out.println("Монстр что-то говорит");
    }
}
