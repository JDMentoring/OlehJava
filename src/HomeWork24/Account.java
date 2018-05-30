package HomeWork24;

import java.io.Serializable;

public class Account implements Serializable, Comparable<Account> {
    private int id;
    private String name;
    private String surname;
    private String cardnumber;
    private String pass;
    private int ballance;


    public Account() {
        this.id = AccountManager.getId();
        this.name = "name";
        this.surname = "surname";
        this.cardnumber = RandomGenerator.createNewCardNumber();
        this.pass = RandomGenerator.createNewPass();
        this.ballance = RandomGenerator.createRandBallance();
    }



    public int compareTo(Account o) {
        if (this.id < o.getId()) {
            return -1;
        } else {
            if (this.id == o.getId()||this.cardnumber == o.getCardnumber()) {
                return 0;
            }
        }
        return 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardnumber='" + cardnumber + '\'' +
                ", pass='" + pass + '\'' +
                ", ballance=" + ballance +
                '}';
    }
}
