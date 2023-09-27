package Comporations.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n" + list);
        Collections.sort(list);
        System.out.println("After sorting: \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id) {                 // first way to override comparable
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }
//        return this.id - o.id;                   // second way to override comparable

//        return this.id.compareTo(o.id);          // third way, if instead of int there is Integer

//        int res = this.name.compareTo(o.name);          // Сортировка оп имени, если имена одинаковые, то сравнивает по фамилии
//        if (res == 0) {
//            res = this.surname.compareTo(o.surname);
//        }
//        return res;
    }
}