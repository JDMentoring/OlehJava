package homeWork14;

public class Pensioner extends Person {
    public Pensioner() {
        super();
    }

    public Pensioner(int money) {
        super(money);
    }


    public int getMoney() {
        return super.getMoney();
    }


    public void setMoney(int money) {
        super.setMoney(money);
    }

    public void payFare(int price) {
        System.out.println("Sucsess");
    }
}
