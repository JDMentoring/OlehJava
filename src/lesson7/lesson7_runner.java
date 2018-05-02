package lesson7;

import lesson5.Student;

public class lesson7_runner {
    public static void main(String[] args) {
        Employee[] employees = { new Manager(), new Manager()};
/*        Manager manager1 = new Manager();
       // employee1 = manager1;
        employee1.setSalary(1000);
        employee1.increaseSalary(25);
        System.out.println(employee1.toString());
        manager1.setSalary(1000);
        manager1.increaseSalary(25);
        System.out.println(manager1.toString());*/
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(1000);
            employees[i].increaseSalary(25);
            System.out.println(employees[i].toString());
        }
    }
}

/*
1. Object link(Stack) / Object(Heap)
2. Static / Dynamic
3. Static -> Overloading
4. Dynamic
    -> Overwriting -->
        1. Super class <--> Sub class
        2. Method setCourse()
 */
