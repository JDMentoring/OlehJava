package HomeWork24;

import HomeWork18.Timer;

import java.sql.SQLOutput;
import java.util.TreeSet;

public class runner {
    public static void main(String[] args) {
        Timer.start();
        AccountManager.fillAccounts();
        Timer.stop();
        System.out.println("Total accounts :" + AccountManager.getAccounts().size());
        System.out.println(((TreeSet<Account>)AccountManager.getAccounts()).first().toString());
        System.out.println(AccountManager.getAccount(0).toString());

    }
}
