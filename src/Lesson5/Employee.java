package Lesson5;

public class Employee {
    Employee(int i, String n, int a, int s){
        id = i;
        name = "n";
        age = a;
        salary = s;
    }

    int id;
    String name;
    int age;
    int salary;

    int Up (){
        salary *= 2;
        return salary;
    }
}
class EmployeeTest{
    public static void main(String[] args) {


        Employee em = new Employee(1, "Vonaski", 24, 100);
        Employee am = new Employee(2, "Ara", 22, 200);

        em.Up();
        System.out.println(em.salary);

    }

}
