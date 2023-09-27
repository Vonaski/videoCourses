package Lesson23;

public class Test1 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
//        Driver dr2 = new Employee();  // Это уже ошибка. Переменная супер класса может ссылаться на объект сабкласса, но не наоборот.
        Object ob = new Doctor();
    }

}
class Employee {
    double salary = 100;
    String name;
    int age;
    int exp;
    void eat() {
        System.out.println("eating");
    }
    void sleep() {
        System.out.println("sleep");
    }
}
class Doctor extends Employee {
    void fix() {System.out.println("fix");}}
class Teacher extends Employee {
    int studentsCount;
    void teach() {
        System.out.println("teach");
    }
}
class Driver extends Employee {
    String car;
    void drive() {
        System.out.println("drive");
    }
}