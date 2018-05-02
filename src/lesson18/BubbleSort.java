package lesson18;

import HomeWork18.Timer;

import java.io.Serializable;

public class BubbleSort<T extends Number & Serializable> {
    private T arr[];

    public BubbleSort(T[] arr) {
        this.arr = arr;
        System.currentTimeMillis();
    }

    void bubbleSort() {
        Timer.start();
        int n = arr.length;
        int counter = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
                    // swap temp and arr[i]
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }

           /* counter++;
            System.out.println("iteration :" + counter);
            printArray();*/
            if (!swapped) {
                break;
            }
        }
        System.out.println(Timer.stop());
    }

    void insertionSort() {
        Timer.start();
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j].doubleValue() > key.doubleValue()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(Timer.stop());
    }

    boolean compareAvarage(BubbleSort<?> args) {
        if (getAverange() == args.getAverange()) {
            return true;
        }
        return false;
    }

    double getAverange() {
        int n = arr.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i].doubleValue();
        }
        return sum / n;
    }

    void selectiontSort() {
        Timer.start();

        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j].doubleValue() < arr[min_idx].doubleValue())
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            T temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Timer.stop());
    }


    /* Prints the array */
    void printArray() {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
