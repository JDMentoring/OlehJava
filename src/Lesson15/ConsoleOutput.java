package Lesson15;

public class ConsoleOutput implements Outputer {
    @Override
    public void showData(String str) {
        System.out.println("Console outputer: "+str);
    }
}
