package Lesson15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Outputer {
    @Override
    public void showData(String str) {
        try {
            FileWriter writer = new FileWriter(new File("123.txt"));
            writer.write(str);
            writer.close();
        } catch (IOException e) {

        }
    }
}
