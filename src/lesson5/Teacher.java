package lesson5;

import java.time.LocalDate;

public class Teacher extends Person {
    private int id;
    private LocalDate expirience;
    private int severy;

    public Teacher() {
        this.id = -1;
        this.expirience = LocalDate.now();
        this.severy = -1;
    }

    public Teacher(String name, String surname, int id, LocalDate expirience, int severy) {
        super(name, surname);
        this.id = id;
        this.expirience = expirience;
        this.severy = severy;
    }

    public Teacher(String name, String surname, LocalDate dateOfBirthday, int id, LocalDate expirience, int severy) {
        super(name, surname, dateOfBirthday);
        this.id = id;
        this.expirience = expirience;
        this.severy = severy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getExpirience() {
        return expirience;
    }

    public void setExpirience(LocalDate expirience) {
        this.expirience = expirience;
    }

    public int getSevery() {
        return severy;
    }

    public void setSevery(int severy) {
        this.severy = severy;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString()+
                ", id=" + id +
                ", expirience=" + expirience +
                ", severy=" + severy +
                '}';
    }
}
