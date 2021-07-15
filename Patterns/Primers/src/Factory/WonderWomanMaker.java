package Factory;

public class WonderWomanMaker implements PlayerMakerFactory{
    @Override
    public Player playerMaker() {
        return new WonderWoman();
    }
}
