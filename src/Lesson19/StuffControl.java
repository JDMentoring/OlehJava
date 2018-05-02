package Lesson19;

public class StuffControl {
    static void showBoxInfo(Stuff<?> someArgs){
        for (int i = 0; i <someArgs.stuff.size() ; i++) {
            System.out.println(someArgs.stuff.get(i).toString());
        }
    }
}
