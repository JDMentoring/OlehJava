package lesson23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkWithWords {
    public static void main(String[] args) {

        String path = "Games.txt";
        String lines = readFile(path);
        System.out.println(lines);
    }

    public  static String readFile(String path){
        StringBuilder stringBuilder = new StringBuilder();

        try{
            Scanner scn = new Scanner(new File(path));
            while(scn.hasNext()){
                stringBuilder.append(scn.nextLine());

            }
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
