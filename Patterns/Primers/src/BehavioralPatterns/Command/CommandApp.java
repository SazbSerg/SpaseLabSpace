package BehavioralPatterns.Command;

public class CommandApp {
    public static void main(String[] args) {
        Hero hero = new Hero();


        Player player = new Player(new RunCommand(hero), new StopCommand(hero), new FireCommand(hero));
        player.runHero();
        player.stopHero();
        player.fireHero();
    }
}
