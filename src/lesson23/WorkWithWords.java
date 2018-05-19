package lesson23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WorkWithWords {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        String path = "Games.txt";
        readFile(path,treeSet);

        ((TreeSet<String>) treeSet).first(); // Sorted => last
        ((TreeSet<String>) treeSet).higher("some");
        String someV = ((TreeSet<String>) treeSet).ceiling("some");
        ((TreeSet<String>) treeSet).pollFirst();
        ((TreeSet<String>) treeSet).descendingIterator();


        getCountOfUniqueWords(treeSet);
    }

    public static void readFile(String path, Set<String> someSet) {
        try {
            Scanner scn = new Scanner(new File(path));
            while (scn.hasNext()) {
                String buffer[] = scn.nextLine().split(" ");
                for (int i = 0; i < buffer.length; i++) {
                    someSet.add(symbolFilter(buffer[i]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String symbolFilter(String s) {
        String r = "";
        char someSymbol = 'A';
        char someSymbol2 = 65;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=33 && s.charAt(i)<=64){
                continue;
            }else{
                r += s.charAt(i);
            }

//
//            if (s.charAt(i) == ',' ||
//                    s.charAt(i) == '.' ||
//                    s.charAt(i) == '?' ||
//                    s.charAt(i) == '!' ||
//                    s.charAt(i) == '-') {
//                continue;
//            } else {
//
//            }
        }
        return r;
    }


    public static void getCountOfUniqueWords(Set<String> treeSet) {
        for (String item :treeSet){
            System.out.println(item);
        }

        System.out.println("This text contains " + treeSet.size() + " unique words.");
    }


}
