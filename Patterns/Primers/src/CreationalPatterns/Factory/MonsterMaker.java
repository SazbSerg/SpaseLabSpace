package CreationalPatterns.Factory;

public class MonsterMaker implements PlayerMakerFactory{
    @Override
    public Player makePlayer() {
        return new Monster();
    }
}
