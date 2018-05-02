package homework3;

public class PersonalComputer extends Computer {

    public PersonalComputer() {
    }

    public PersonalComputer(Cpu cpu, String gpu, int ram, int rom, int price) {
        super(cpu, gpu, ram, rom, price);
    }

    public Cpu getCpu() {
        return (super.getCpu());
    }

    public void setCpu(Cpu cpu) {
        super.setCpu(cpu);
    }

    public String getGpu() {
        return (super.getGpu());
    }

    public void setGpu(String gpu) {
        super.setGpu(gpu);
    }

    public int getRam() {
        return (super.getRam());
    }

    public void setRam(int ram) {
        super.setRam(ram);

    }

    public int getRom() {
        return (super.getRom());
    }
        public void setRom ( int rom){
            super.setRom(rom);

        }
        public int getPrice () {
            return (super.getPrice());
        }

        public void setPrice ( int price){
            super.setPrice(price);
        }

        @Override
        public String toString () {
            return "Computer{" + super.toString() +
                    '}';
        }

    }