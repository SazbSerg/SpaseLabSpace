package CreationalPatterns.Factory;

public class FactoryApplication {
    public static void main(String[] args) {
        PlayerMakerFactory playerMakerFactory = setPlayer("wonderwoman");
       // PlayerMakerFactory playerMakerFactory = new WonderWomanMaker();
        Player player = playerMakerFactory.makePlayer();
        player.fire();
        player.going();
        player.speaking();

        PlayerMakerFactory playerMakerFactory1 = setPlayer("superman");
        Player player1 = playerMakerFactory1.makePlayer();
        player1.fire();
        player1.going();
        player1.speaking();

        PlayerMakerFactory playerMakerFactory2 = new ZevsMakerFactory();
        Player player2 = playerMakerFactory2.makePlayer();
        player2.speaking();

    }
    public static PlayerMakerFactory setPlayer(String maker){
        if (maker.equalsIgnoreCase("wonderwoman"))
            return new WonderWomanMaker();
        else if (maker.equalsIgnoreCase("monster"))
            return new MonsterMaker();
        else if (maker.equalsIgnoreCase("superman"))
            return new SuperManMaker();
        throw new RuntimeException("Выбери нормального героя, а не придумывай что-то" + maker);
    }
}
