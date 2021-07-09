package CreationalPatterns.Builder;

public class ComputerBuilder {
    Monitor monitor = Monitor.DEFAULT_MONITOR;
    Keaboard keaboard = Keaboard.DEFAULT_KEABOARD;
    Mouse mouse = Mouse.DEFAULT_MOUSE;
    SystemBlock systemBlock = SystemBlock.DEFAULT_SYSTEM_BLOCK;

    ComputerBuilder buildMonitor(Monitor monitor){
        this.monitor = monitor;
        return this;
    }
    ComputerBuilder buildKeabord(Keaboard keaboard){
        this.keaboard = keaboard;
        return this;
    }
    ComputerBuilder buildMouse(Mouse mouse){
        this.mouse = mouse;
        return this;
    }
    ComputerBuilder buildSystemBlock(SystemBlock systemBlockonitor){
        this.systemBlock = systemBlock;
        return this;
    }
    Computer build(){
        Computer computer = new Computer();
        computer.setKeaboard(keaboard);
        computer.setMonitor(monitor);
        computer.setMouse(mouse);
        computer.setSystemBlock(systemBlock);
        return  computer;
    }


}
