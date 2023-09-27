package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.help();
        h.firefighter();
        s.swim();
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
class Teacher extends Employee implements Help_able {
    int studentsCount;
    void teach() {
        System.out.println("teach");
    }
    public void help(){
        System.out.println("Teacher helps");
    }
    public void firefighter(){
        System.out.println("Teacher puts out fire");
    }
}
class Driver extends Employee implements Help_able, Swim_able {
    String car;
    void drive() {
        System.out.println("drive");
    }
    public void help(){
        System.out.println("Driver helps");
    }
    public void firefighter(){
        System.out.println("Driver puts out fire");
    }
    public void swim() {
        System.out.println("Driver swims");
    }
}
interface Help_able {
    void help();
    void firefighter();
    int a = 5;
}
interface Swim_able {
    void swim();
}