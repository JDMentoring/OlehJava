package lesson5;

import java.time.LocalDate;

public class BudgetStudent extends Student {
   private int stipend;

    public BudgetStudent() {
        setStipend(-1);

    }

    public BudgetStudent(String name, String surname, int course, String group, int stipend) {
        super(name, surname, course, group);
        setStipend(stipend);
    }

    public BudgetStudent(String name, String surname, LocalDate dateOfBirthday, int id, int course, String group, int stipend) {
        super(name, surname, dateOfBirthday, id, course, group);
        setStipend(stipend);
    }

    public int getStipend() {
        return stipend;
    }

    public void setStipend(int stipend) {

        if (stipend >= 0) {
            this.stipend = stipend;
        }
    }

    @Override
    public String toString() {
        return "BudgetStudent{" +
                super.toString()+
                ",stipend=" + stipend +
                '}';
    }
}
