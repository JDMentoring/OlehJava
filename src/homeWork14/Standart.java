package homeWork14;

import lesson14.MainCall;

public class Standart extends Person implements MainCall {
    public Standart() {
        super();
    }

    public Standart(int money) {
        super(money);
    }

   public int getMoney() {
        return super.getMoney();
    }


    public void setMoney(int money) {
        super.setMoney(money);
    }


    public void payFare(int price) {
        if(super.getMoney()>price){
            super.setMoney(getMoney()-price);
            System.out.println("Sucsess");
        }else{
            System.out.println("Oops, you have not enough money.");
        }
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public Object getInstanse() {
        return new Standart();
    }

    @Override
    public String toString() {
        return "Standart " + super.toString();
    }
}
