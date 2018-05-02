package homework3;

import lesson6.ConsoleScanner;

public class Computer {
    private Cpu cpu;
    private String gpu;
    private int ram;
    private int rom;
    private int price;

    public Computer() {

        this.gpu = "no gpu";
        this.ram = -1;
        this.rom = -1;
        this.price = -1;
    }

    public Computer(Cpu cpu, String gpu, int ram, int rom, int price) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setGpu() {
      this.gpu = ConsoleScanner.readStringValue("Enter your GPU");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0) {
            this.ram = ram;
        }
    }

    public void setRam(String s) {
        setRam(ConsoleScanner.readIntValue(s));
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        if (rom > 0) {
            this.rom = rom;
        }
    }

    public void setRom(String s) {
        setRom(ConsoleScanner.readIntValue(s));
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setPrice(String s) {
        setPrice(ConsoleScanner.readIntValue(s));
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", price=" + price +
                '}';
    }
}
