
package facade;

public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(24, hd.read(2342342, 2048));
        ram.load(174, hd.read(1123123, 1024));
        processor.jump(240);
        processor.execute();
    }
}

