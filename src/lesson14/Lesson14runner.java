package lesson14;

import homeWork14.Pensioner;
import homeWork14.Standart;
import homeWork14.Student;

public class Lesson14runner {
    public static void main(String[] args) {
        Standart standart = new Standart();
        Student student = new Student();
        Pensioner pensioner  = new Pensioner();

        MainCall mc = student;

        standart.showInfo();
        mc.showInfo();
        if (mc instanceof Standart) {
            standart = (Standart) mc.getInstanse();
        }
    }


}
