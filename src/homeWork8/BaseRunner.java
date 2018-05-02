package homeWork8;

import lesson6.ConsoleScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseRunner {

    public static void run() {
        Base base = new Base();
        boolean exit;
        base.loadDriver();
        do {
            exit = true;
            System.out.println("1 Отримати інформацію про водія \n2 Отримати список водіїв\n3 Додати водія \n4 Вийти");
            switch (ConsoleScanner.readStringValue("Введіть пункт меню")) {
                case "1":
                    base.getDriver(ConsoleScanner.readIntValue("Введіть id водія")).toString();
                    break;
                case "2":
                    base.showDrivers();
                    break;
                case "3":
                    base.addDriver();
                    break;
                case "4":
                    exit = false;
                    break;
                default:
                    System.out.println("неправильне значення,введіть ще раз");
                    break;
            }
        } while (exit);
    }
}


