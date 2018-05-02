package homeWork14;

public abstract class Person{
    private int money;
    private String name;

    public Person() {
        this.money = 0;
    }

    public Person(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public abstract void payFare(int price);

    @Override
    public String toString() {
        return "Person{" +
                "money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
