package homeWork8;

import lesson6.ConsoleScanner;

import java.io.Serializable;
import java.util.InputMismatchException;

public class Person implements Serializable {
    private char[] bannedSimbols = {'0','1','2','3','4','5','6', '7', '8',
     '9','!','@','#', '$','%','^','&', '*','(',')', '№',';',':','?',};
    private static final long serialVersionUID = 42L;
    private String name;
    private String surname;
    private String number;

    public Person() {
        this.name = "noName";
        this.surname = "noSurname";
        this.number = "09611111113";
    }

    public Person(String name, String surname, String number) {
        setName(name);
        setSurname(surname);
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        CharSequence seq = java.nio.CharBuffer.wrap(bannedSimbols);
        do {
            try {
                    if (name.contains(seq)) {
                        throw  new InputMismatchException("Введіні заборонені символи, введіть ще раз>>");
                    }
                this.name = name;
            } catch (InputMismatchException e) {
                e.getMessage();
                ConsoleScanner.reset();
                name = ConsoleScanner.readStringValue("");

            }
        } while (true);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        return number != null ? number.equals(person.number) : person.number == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name + "," + surname + "," + number;
    }
}
