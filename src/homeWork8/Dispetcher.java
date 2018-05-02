package homeWork8;

import java.io.Serializable;
import java.time.LocalDate;

public class Dispetcher extends Person implements Serializable{
    private LocalDate hireingDate;
    private static final long serialVersionUID = 49L;
    public Dispetcher() {
        super();
        this.hireingDate = LocalDate.now();

    }

    public Dispetcher(String name, String surname, String number) {
        super(name, surname, number);
        this.hireingDate = LocalDate.now();
    }

    public LocalDate getHireingDate() {
        return hireingDate;
    }

    public void setHireingDate(LocalDate hireingDate) {
        this.hireingDate = hireingDate;
    }

    @Override
    public String toString() {
        return super.toString()+"," + hireingDate+"," ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dispetcher that = (Dispetcher) o;

        return hireingDate != null ? hireingDate.equals(that.hireingDate) : that.hireingDate == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hireingDate != null ? hireingDate.hashCode() : 0);
        return result;
    }
}
