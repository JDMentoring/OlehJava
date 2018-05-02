package lesson18;

public class lesson18_1runner {

    public static void main(String[] args) {
        Integer arrI[] = {5, 64, 34, 25, 12, 22, 11, 90};
        Double arrD[] = {5.0, 64.0, 34.0, 25.0, 12.0, 22.0, 11.0, 90.0};

        BubbleSort<Integer> obI = new BubbleSort(arrI);
        BubbleSort<Double> obD = new BubbleSort(arrD);
        System.out.print("Integer array average:"+ obI.getAverange());
        System.out.print("Double array average:"+ obD.getAverange());
        System.out.println(obI.compareAvarage(obD));

        //obI = obD;

        //obI.insertionSort();
        ///obI.printArray();
        //    System.out.print("Double array :");
        // obD.bubbleSort();
        //obD.printArray();
        /*b.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);*/
    }
}
