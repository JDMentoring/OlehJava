package lesson23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WorkWithWords {
    public static void main(String[] args) {
        String path = "LorenIpsum.txt";
        String[] words = symbolFilter(readFile(path)).split(" ");
        TreeSet<String> treeSet = arrToTreeSet(words);
        getCountOfUniqueWords(treeSet);
    }

    public static String readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            Scanner scn = new Scanner(new File(path));
            while (scn.hasNext()) {
                stringBuilder.append(scn.nextLine());

            }
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public static String symbolFilter(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ',' &&
                    s.charAt(i) != '.' &&
                    s.charAt(i) != '?' &&
                    s.charAt(i) != '!' &&
                    s.charAt(i) != '-') r += s.charAt(i);
        }
        return r;
    }

    public static TreeSet<String> arrToTreeSet(String[] strArr){
        TreeSet<String> temp = new TreeSet<>();
        for(int i = 0;i<strArr.length;i++){
            temp.add(strArr[i]);
        }
        return  temp;
    }

    public static void getCountOfUniqueWords(TreeSet<String> treeSet){
        System.out.println("This text contains "+treeSet.size()+" unique words.");
    }


}
