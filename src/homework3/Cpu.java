package homework3;

public class Cpu {
    private String name;
    private int cores;
    private int threads;
    private int freqency;
    private int tdp;

    public Cpu() {
        this.name = "noname";
        this.cores = -1;
        this.threads = -1;
        this.freqency = -1;
        this.tdp = -1;
    }

    public Cpu(String name, int cores, int threads, int freqency, int tdp) {
        this.name = name;
        setCores(cores);
        setFreqency(freqency);
        setTdp(tdp);
        setThreads(threads);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        if (cores > 0) {
            this.cores = cores;
        }
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        if (threads > cores && threads > 0) {
            this.threads = threads;
        }
    }

    public int getFreqency() {
        return freqency;
    }

    public void setFreqency(int freqency) {
        if (freqency > 0) {
            this.freqency = freqency;
        }
    }

    public int getTdp() {
        return tdp;
    }

    public void setTdp(int tdp) {
        if (tdp > 0) {
            this.tdp = tdp;
        }
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                ", threads=" + threads +
                ", freqency=" + freqency +
                ", tdp=" + tdp +
                '}';
    }
}
