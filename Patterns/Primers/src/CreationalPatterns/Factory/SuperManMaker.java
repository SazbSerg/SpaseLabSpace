package CreationalPatterns.Factory;

public class SuperManMaker implements PlayerMakerFactory{
    @Override
    public Player makePlayer() {

        return new SuperMan();
    }
}
