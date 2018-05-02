package HomeWork18;

public class Timer {
    static long startTime;
    static long stopTime;
    static long duration;

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static long stop() {
        stopTime = System.currentTimeMillis();
        duration =stopTime - startTime;
        return duration;
    }

}
