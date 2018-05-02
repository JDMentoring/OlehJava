package lesson5;

import java.time.LocalDate;

public class Lesson5runner {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Олег","Галяк");
        Person person3 = new Person("Олег","Галяк", LocalDate.of(2003,01,29));
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3 .toString());
        Student student1 = new Student("Олег","Галяк", LocalDate.of(2003,01,29),
                7,1,"new group");
        System.out.println(student1.toString());


    }
}
