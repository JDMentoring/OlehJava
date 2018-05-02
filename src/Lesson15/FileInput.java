package Lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileInput implements Inputer {
    public FileInput() {
    }

    @Override
    public void showType() {
        System.out.print("From FileInput:"+TYPE);
    }

    @Override
    public String getData() {
        try{
            Scanner scn = new Scanner(new File("123.txt"));
            return scn.nextLine();
        } catch (FileNotFoundException e) {
            return null;
        }


    }
}
