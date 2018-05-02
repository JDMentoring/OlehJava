package lesson7;

import java.time.LocalDate;

public class Manager extends Employee {
    private int officeNumber;

    public Manager() {
        this.officeNumber = 0;
    }

    public Manager(String name, String surname, int id, LocalDate hieringdate, double salary, int officeNumber) {
        super(name, surname, id, hieringdate, salary);
        this.officeNumber = officeNumber;
    }

    public Manager(String name, String surname, LocalDate dateOfBirthday, int id, LocalDate hieringdate, double salary, int officeNumber) {
        super(name, surname, dateOfBirthday, id, hieringdate, salary);
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public void increaseSalary(double percents) {
       // super.increaseSalary(percents+10);
    }

    @Override
    public String toString() {
        return "Manager{" +super.toString()+
                "officeNumber=" + officeNumber +
                '}';
    }
}
