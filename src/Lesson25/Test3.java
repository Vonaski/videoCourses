package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();
        Employee2 emp4 = new Employee2();
        Employee2[] array = {emp1, emp2, emp3};
        for (Employee2 e : array){
            if (e instanceof Driver2){
                System.out.println(((Driver2) e).car);
                ((Driver2) e).drive();
            }
        }
        //        Doctor2 d1 = (Doctor2) emp1;
        System.out.println(((Doctor2)emp1).specialization);
        ((Doctor2)emp1).treat();
        ((Doctor2)emp1).help();
    }
}
class Employee2 {
    String name;
    int age;
    int exp;
    void eat() {
        System.out.println("eating");
    }
    void sleep() {
        System.out.println("sleep");
    }}

class Doctor2 extends Employee2 implements Help_able{
    public void help() {
        System.out.println("Doctor helps");
    }

    String specialization = "Hirurg";
    void treat() {System.out.println("Doctor treats");}}

class Teacher2 extends Employee2 {
    int studentsCount;
    void teach() {
        System.out.println("Teacher teaches");
    }}

class Driver2 extends Employee2 {
    String car = "Mercedes";
    void drive() {
        System.out.println("The Driver drives");
    }}

interface Help_able {
    void help();
}