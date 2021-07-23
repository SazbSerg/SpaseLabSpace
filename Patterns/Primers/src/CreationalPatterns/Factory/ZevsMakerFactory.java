package CreationalPatterns.Factory;

public class ZevsMakerFactory implements PlayerMakerFactory{
    @Override
    public Player makePlayer() {
        return new Zevs();
    }
}
