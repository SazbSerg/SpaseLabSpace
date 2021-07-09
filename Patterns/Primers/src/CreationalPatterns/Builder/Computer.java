package CreationalPatterns.Builder;

public class Computer {
    Monitor monitor;
    Keaboard keaboard;
    Mouse mouse;
    SystemBlock systemBlock;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKeaboard(Keaboard keaboard) {
        this.keaboard = keaboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "monitor=" + monitor +
                ", keaboard=" + keaboard +
                ", mouse=" + mouse +
                ", systemBlock=" + systemBlock +
                '}';
    }
}
