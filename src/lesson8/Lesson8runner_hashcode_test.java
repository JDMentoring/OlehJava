package lesson8;

import lesson5.Person;

import java.time.LocalDate;
import java.util.Objects;

public class Lesson8runner_hashcode_test {
    public static void main(String[] args)  {
        Person p1 = new Person("олег", "галяк", LocalDate.of(2003,01,28));
        Person p2 = new Person("олег", "галяк", LocalDate.of(2003,01,29));
        Person p3;
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


        System.out.println(p2.getClass());





        System.out.println(p1==p2);

        System.out.println(p1.equals(p2));
    }
}
