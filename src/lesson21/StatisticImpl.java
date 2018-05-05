package lesson21;

public class StatisticImpl<T extends Comparable<T>> implements Statistic<T> {
    private T arr[];

    public StatisticImpl(T[] arr) {
        this.arr = arr;
        System.currentTimeMillis();
    }

    @Override
    public T getMin() {
        T min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public T getMax() {
        return null;
    }

    @Override
    public T getAverage() {
        return null;
    }
}
