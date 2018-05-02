package lesson5;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirthday;

    public Person() {
        this.name = "no name";
        this.surname = surname= "no surname";
        this.dateOfBirthday = LocalDate.now();
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = LocalDate.now() ;
    }

    public Person(String name, String surname, LocalDate dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
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

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        return dateOfBirthday != null ? dateOfBirthday.equals(person.dateOfBirthday) : person.dateOfBirthday == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (dateOfBirthday != null ? dateOfBirthday.hashCode() : 0);
        return result;
    }
}
