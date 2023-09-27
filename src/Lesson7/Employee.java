package Lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void infosal() {
        System.out.println(salary);
    }

    public void infosur() {
        System.out.println(surname);
    }

    public void infoid() {
        System.out.println(id);
    }

    public Employee(double salary1) {
        salary = salary1;
    }

    Employee(String surname1) {
        surname = surname1;
    }

    private Employee(int id1) {
        id = id1;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(200);
        Employee emp1 = new Employee("Iksanov");
        Employee emp2 = new Employee(1);
        System.out.println(emp2.surname);
    }
}
