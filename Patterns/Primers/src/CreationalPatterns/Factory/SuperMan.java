package CreationalPatterns.Factory;

public class SuperMan implements Player{
    @Override
    public void going() {
        System.out.println("Супермен куда-то пошёл");
    }

    @Override
    public void fire() {
        System.out.println("Супермен в кого-то стреляет");
    }

    @Override
    public void speaking() {
        System.out.println("Супермен что-то говорит");
    }
}
