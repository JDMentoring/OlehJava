package Lesson13;

import lesson6.ConsoleScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson13_1 {
    public static void calculate() {
        int result = 0;
        Scanner scn = new Scanner(System.in);
        do {
            try {
                System.out.print("Please enter A:");
                int a = scn.nextInt();
                int b = ConsoleScanner.readIntValue("Please enter B:");
                result = a / b;
                //throw  new ArithmeticException("Some test");
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scn.next();
            } catch (Exception e) {
                e.printStackTrace();
            }
            int b = ConsoleScanner.readIntValue("Please enter B:");

        } while (true);
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        calculate();
    }
}
