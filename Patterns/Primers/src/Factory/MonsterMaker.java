package Factory;

public class MonsterMaker implements PlayerMakerFactory{
    @Override
    public Player playerMaker() {
        return new Monster();
    }
}
