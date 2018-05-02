package lesson5;

import lesson6.ConsoleScanner;

import java.time.LocalDate;

public class Student extends Person {

    private static int nextID = 0;
    private int id;
    private int course;
    private String group;

    public Student() {
        setId();
        this.course = -1;
        this.group = "test group";
    }

    public Student(String name, String surname, int course, String group) {
        super(name, surname);
        setId();
        this.course = course;
        this.group = group;
    }

    Student(String name, String surname, LocalDate dateOfBirthday, int id, int course, String group) {
        super(name, surname, dateOfBirthday);
        this.id = id;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void setId() {
        this.id = nextID;
        nextID++;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setCourse(){
       this.course = ConsoleScanner.readIntValue("Please enter your course:");
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGroup() {
        this.group = group;
    }

    public static void setNextID(int startValue) {
        if (nextID == 0) {
            nextID = startValue;
        } else {
            System.out.println("forbidden");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", id=" + id +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
