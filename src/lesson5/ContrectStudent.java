package lesson5;

import java.time.LocalDate;

public class ContrectStudent extends Student{
    private int educPrice;

    public ContrectStudent() {
        this.educPrice = -1;
    }

    public ContrectStudent(String name, String surname, int course, String group, int educPrice) {
        super(name, surname, course, group);
        this.educPrice = educPrice;
    }

    public ContrectStudent(String name, String surname, LocalDate dateOfBirthday, int id, int course, String group, int educPrice) {
        super(name, surname, dateOfBirthday, id, course, group);
        setEducPrice(educPrice);
    }

    public int getEducPrice() {
        return educPrice;
    }

    public void setEducPrice(int educPrice) {
        if (educPrice>0) {
            this.educPrice = educPrice;
        }
    }

    @Override
    public String toString() {
        return "ContrectStudent{" +
                super.toString()+
                ",educPrice=" + educPrice +
                '}';
    }
}
