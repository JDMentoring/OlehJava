package homework3;

public class Tablet extends Portable {

    public Tablet() {
    }

    public Tablet(Cpu cpu, String gpu, int ram, int rom, int price, int batteyCapacity, String name, int diagonal) {
        super(cpu, gpu, ram, rom, price, batteyCapacity, name, diagonal);
    }

    @Override
    public String toString() {
        return "Tablet{"+super.toString()+"}";
    }
}
