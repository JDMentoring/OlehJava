package homework3;

public class Phone extends Portable {
    public String gsmModule;

    public Phone(String gsmModule) {
        this.gsmModule = "no gsm module";
    }


    public Phone(Cpu cpu, String gpu, int ram, int rom, int price, int batteyCapacity, String name, int diagonal, String gsmModule) {
        super(cpu, gpu, ram, rom, price, batteyCapacity, name, diagonal);
        this.gsmModule = gsmModule;
    }

    public String getGsmModule() {
        return gsmModule;
    }

    public void setGsmModule(String gsmModule) {
        this.gsmModule = gsmModule;
    }

    @Override
    public String toString() {
        return "Phone{" +
                super.toString()+
                ",gsmModule='" + gsmModule + '\'' +
                '}';
    }
}
