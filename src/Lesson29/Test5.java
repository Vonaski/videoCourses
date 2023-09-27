package Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test5 {
}
class Employee {
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee {
    static void printEmployee(Employee emp) {
        System.out.println("Name: " + emp.name + ". Department: " + emp.department + ". Salary: " + emp.salary);
    }
    void filterEmployees(ArrayList<Employee> emp, Predicate<Employee> p) {
        for (Employee e : emp) {
            if (p.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "IT", 1500);
        Employee emp2 = new Employee("Endy", "Economic", 1000);
        Employee emp3 = new Employee("Engineer", "Engineer", 450);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        TestEmployee te = new TestEmployee();
        te.filterEmployees(list, e -> (e.department.equals("IT") && e.salary > 200));
        System.out.println("----------------------------------------------------");
        te.filterEmployees(list, e -> e.name.startsWith("E") && e.salary != 450);
        System.out.println("----------------------------------------------------");
        te.filterEmployees(list, e -> e.department.equals(e.name));
        System.out.println("----------------------------------------------------");
    }
}