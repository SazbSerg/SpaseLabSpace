package Factory;

public class SuperManMaker implements PlayerMakerFactory{
    @Override
    public Player playerMaker() {
        return new SuperMan();
    }
}
