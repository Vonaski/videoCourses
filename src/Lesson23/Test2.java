package Lesson23;

public class Test2 {
    public static void main(String[] args) {
        Employee2 e = new Teacher2();
        e.eat();
    }
}
class Employee2 {
    double salary = 100;
    String name;
    int age;
    int exp;

    void eat() {
        System.out.println("Employee eating");
    }
    void sleep() {
        System.out.println("sleep");
    }
}
class Teacher2 extends Employee2 {
    @Override
    void eat() {
        System.out.println("Teacher eating");
    }
    int studentsCount;
    void teach() {
        System.out.println("teach");
    }
}