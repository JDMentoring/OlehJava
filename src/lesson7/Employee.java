package lesson7;

import lesson5.Person;

import java.time.LocalDate;

public abstract class Employee extends Person {
    private static int newId = 1;
    private int id;
    private LocalDate hieringdate;
    private double salary;


    public Employee() {

        setId();
        this.hieringdate = LocalDate.now();
        this.salary = 0;
    }

    public Employee(String name, String surname, int id, LocalDate hieringdate, double salary) {
        super(name, surname);
        this.id = id;
        this.hieringdate = hieringdate;
        this.salary = salary;
    }

    public Employee(String name, String surname, LocalDate dateOfBirthday, int id, LocalDate hieringdate, double salary) {
        super(name, surname, dateOfBirthday);
        this.id = id;
        this.hieringdate = hieringdate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        this.id = newId;
        newId++;
    }

    public LocalDate getHieringdate() {
        return hieringdate;
    }

    public void setHieringdate(LocalDate hieringdate) {
        this.hieringdate = hieringdate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void increaseSalary(double percents);



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", hieringdate=" + hieringdate +
                ", salary=" + salary +
                '}';
    }
}
