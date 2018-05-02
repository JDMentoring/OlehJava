package Lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson15runner {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        //Replacer replacer = new Replacer(new ConsoleInput(),new ConsoleOutput());
        do {
            System.out.println("Виберіть дію:");
            System.out.println("1)Переставити");
            System.out.println("2)вийти");
            System.out.print(">>");
            switch (scn.next()) {
                case "1":
                    replace();
                    break;
                case "2":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введене число неправильне!");
                    break;
            }
        } while (true);
    }

    public static void replace() {
        Replacer replacer = new Replacer();
        System.out.println("Виберіть спосіб отримання інформації:");
        System.out.println("1)консоль");
        System.out.println("2)файл");
        boolean exit = false;
        do {
            System.out.print(">>");
            switch (scn.next()) {
                case "1":
                    replacer.setInput(new ConsoleInput());
                    exit = true;
                    break;
                case "2":
                    replacer.setInput(new FileInput());
                    exit = true;
                    break;
                default:
                    System.out.println("Неправильне число, спробуйте ще раз.");
                    break;

            }
        } while (!exit);
            exit = false;
        System.out.println("Виберіть спосіб запису інформації:");
        System.out.println("1)консоль");
        System.out.println("2)файл");
        do {
            System.out.print(">>");
            switch (scn.next()) {
                case "1":
                    replacer.setOutput(new ConsoleOutput());
                    exit = true;
                    break;
                case "2":
                    replacer.setOutput(new FileOutput());
                    exit = true;
                    break;
                default:
                    System.out.println("Неправильне число, спробуйте ще раз.");
                    break;

            }
        } while (!exit);
        replacer.replace();
    }

}
