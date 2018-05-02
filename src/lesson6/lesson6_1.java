package lesson6;

import lesson5.Student;

import java.util.Random;

public class lesson6_1 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int size = 20;
        Student.setNextID(rnd.nextInt(60)+1);
        Student.setNextID(rnd.nextInt(60)+1);
        Student students[] = new Student[size];


        for (int i = 0; i < size; i++) {
            students[i] = new Student();
            //System.out.println(students[i].toString());
        }


        for (Student st : students) {
            System.out.println(st.toString());
        }

        Student st = new Student("Nazar", "Mh",5, "CI15");
        st.setCourse();

        System.out.println(st.toString());
    }
}
