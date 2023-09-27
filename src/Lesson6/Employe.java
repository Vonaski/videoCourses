package Lesson6;

public class Employe {
    Employe(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    Employe(String surname3, int age3) {
        this(0,surname3,age3, 0.0, null);
    }

    Employe(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeTest {
    public static void main(String[] args) {
        Employe emp1 = new Employe(1, "Ivanov", 25);
        Employe emp2 = new Employe("Petrov", 30);
        Employe emp3 = new Employe(2, "Sidorov", 40, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
