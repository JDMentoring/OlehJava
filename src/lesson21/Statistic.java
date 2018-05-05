package lesson21;

public interface Statistic<T extends Comparable<T>>{
    T getMin();
    T getMax();
    T getAverage();
}
