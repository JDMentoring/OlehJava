package homework3;

public class Portable extends Computer{
    private int  batteyCapacity;
    private String name;
    private int diagonal;

    public Portable() {
        this.batteyCapacity = -1;
        this.name = "no name";
        this.diagonal = -1;
    }



    public Portable(Cpu cpu, String gpu, int ram, int rom, int price, int batteyCapacity, String name, int diagonal) {
        super(cpu, gpu, ram, rom, price);
        this.batteyCapacity = batteyCapacity;
        this.name = name;
        this.diagonal = diagonal;
    }

    public int getBatteyCapacity() {
        return batteyCapacity;
    }

    public void setBatteyCapacity(int batteyCapacity) {
        if (batteyCapacity>0) {
            this.batteyCapacity = batteyCapacity;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        if (diagonal>0) {
            this.diagonal = diagonal;
        }
    }

    @Override
    public String toString() {
        return "Portable{" +
                super.toString()+
                ",batteyCapacity=" + batteyCapacity +
                ", name='" + name + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}
