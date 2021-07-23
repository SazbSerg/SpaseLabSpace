package CreationalPatterns.Factory;

public class Zevs implements Player{
    @Override
    public void going() {
        System.out.println("Я крут");
    }

    @Override
    public void fire() {
        System.out.println("Стреляю молниями");
    }

    @Override
    public void speaking() {
        System.out.println("Гром гремит");
    }
}
