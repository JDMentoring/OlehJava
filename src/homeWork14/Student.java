package homeWork14;

import lesson14.MainCall;

public class Student extends Person implements MainCall {
    public Student() {
        super();
    }

    public Student(int money) {
        super(money);
    }


    public int getMoney() {
        return super.getMoney();
    }


    public void setMoney(int money) {
        super.setMoney(money);
    }


    public void payFare(int price) {
        if(super.getMoney()>price/2){
            super.setMoney(getMoney()-price/2);
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

        return new Student();
    }

    @Override
    public String toString() {
        return "Student " + super.toString();
    }
}
