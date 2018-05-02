package lesson7;

import java.time.LocalDate;

public class Cashier extends Employee {
    private int cashregNumber;

    public Cashier(String name, String surname, int id, LocalDate hieringdate, double salary, int cashregNumber) {
        super(name, surname, id, hieringdate, salary);
        this.cashregNumber = cashregNumber;
    }

    public Cashier(String name, String surname, LocalDate dateOfBirthday, int id, LocalDate hieringdate, double salary, int cashregNumber) {
        super(name, surname, dateOfBirthday, id, hieringdate, salary);
        this.cashregNumber = cashregNumber;
    }

    public int getCashregNumber() {
        return cashregNumber;
    }

    public void setCashregNumber(int cashregNumber) {
        this.cashregNumber = cashregNumber;
    }

    public void increaseSalary(double percents) {
        setSalary(getSalary()* (percents+15)+getSalary() );
    }

    @Override
    public String toString() {
        return "Cashier{" +
                super.toString()+
                ",cashregNumber=" + cashregNumber +
                '}';
    }


}