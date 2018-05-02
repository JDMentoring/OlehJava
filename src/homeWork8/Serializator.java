package homeWork8;

import java.io.*;

public  class Serializator {
    public static void saveData(String path,Object obj){
        try {
            FileOutputStream output = new FileOutputStream(path);
            ObjectOutputStream objStream =new ObjectOutputStream(output);
            objStream.writeObject(obj);
            objStream.close();
            output.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Object readData(String path){
        Object tepmObj = null;
        try {
            FileInputStream input =new FileInputStream(path);
            ObjectInputStream objStream = new ObjectInputStream(input);
            tepmObj = objStream.readObject();
            objStream.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tepmObj;
    }
}
