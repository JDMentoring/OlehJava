package HomeWork24;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AccountManager {
    private static int nextId = 0;
    private static Set<Account> accounts = new TreeSet<Account>();


    public static int getId() {
        int id = nextId;
        nextId++;
        return id;
    }

    public static void fillAccounts(int amount) {
        while (accounts.size() < amount) {
            Account a = new Account();
            accounts.add(a);
        }
    }

    public static Account getAccount(int id) {

        if(((TreeSet<Account>)accounts).first().getId()==id){
            return ((TreeSet<Account>)accounts).first();
        }

            Iterator<Account> iterator = accounts.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getId() == id)
                return iterator.next();
        }
        System.out.println("Account with this id doesn't exist");
        return null;
    }

    public static Set getAccounts() {
        return accounts;
    }

    public static void setAccounts(Set accounts) {
        accounts = accounts;
    }


    public static void show() {
        for (Account item:accounts){
            System.out.println(item);
        }
    }

}
