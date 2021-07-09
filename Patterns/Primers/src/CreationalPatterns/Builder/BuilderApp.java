package CreationalPatterns.Builder;

public class BuilderApp {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .buildSystemBlock(SystemBlock.MODEL1)
                .buildKeabord(Keaboard.HP)
                .buildMouse(Mouse.GENIUS)
                .buildMonitor(Monitor.SAMSUNG)
                .build();
        System.out.println(computer);

    }
}
