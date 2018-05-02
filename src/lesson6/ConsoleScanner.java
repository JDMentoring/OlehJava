package lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class ConsoleScanner {
    private ConsoleScanner(){}
    private static Scanner scn =new Scanner(System.in);

    public static void reset(){
        scn.next();
    }

    public static int readIntValue (String str)throws InputMismatchException{
        int n = 0;
        do {
            try {
                System.out.print(str);
                n = scn.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Неправильне число, спобуйте ще раз>>");
                ConsoleScanner.reset();
            }
        } while (true);
        return  n;
    }


    public static Double readDoubleValue (String str){
        System.out.print(str);
        return scn.nextDouble();
    }

    public static String readStringValue (String str){
        System.out.print(str);
        return scn.next();
    }

    public static char readCharValue (String str){
        System.out.print(str);
        return scn.next().charAt(0);
    }

}
