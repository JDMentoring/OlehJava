package lesson21;

public class Lesson21runner {
    public static void main(String[] args) {
        Integer arrI[] = {5, 64, 34, 25, 12, 22, 11, 90};
        Product[] products = {
                new Product(4,"bread",9),
                new Product(6,"milk",20),
                new Product(3,"butter",25)};
        //Sorting.bubbleSort(arrI);
       // Sorting.printArray(arrI);
        Statistic<Product> stI = new StatisticImpl<>(products);
        System.out.println(stI.getMin().toString());
    }
}
