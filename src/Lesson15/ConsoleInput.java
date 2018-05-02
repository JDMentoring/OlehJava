package Lesson15;

import lesson6.ConsoleScanner;

public class ConsoleInput implements Inputer {
    @Override
    public String getData() {
        return ConsoleScanner.readStringValue("Console inputer: pleace, input your data>>");
    }

    @Override
    public void showType() {
        System.out.println("From ConsoleInputer: "+TYPE);
    }
}
