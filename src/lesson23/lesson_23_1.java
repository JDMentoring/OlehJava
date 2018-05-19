package lesson23;

import java.util.*;

public class lesson_23_1 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();


        numbers.add(333);
        numbers.add(433);
        numbers.add(5433);

//        for (int i = 0; i <numbers.size() ; i++) {
//            System.out.println(numbers.get(i));
//        }


        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }




    }
}
