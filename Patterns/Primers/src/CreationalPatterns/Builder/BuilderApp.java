
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

        Computer computer2 = new ComputerBuilder()
                .buildSystemBlock(SystemBlock.MODEL2)
                .buildKeabord(Keaboard.GENIUS)
                .buildMouse(Mouse.A4TECH)
                .buildMonitor(Monitor.TOSHIBA)
                .build();
        System.out.println(computer2);

    }
}

