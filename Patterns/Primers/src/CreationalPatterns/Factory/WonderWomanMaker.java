package CreationalPatterns.Factory;

public class WonderWomanMaker implements PlayerMakerFactory{
    @Override
    public Player makePlayer() {
        return new WonderWoman();
    }
}
