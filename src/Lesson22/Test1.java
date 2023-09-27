package Lesson22;

public class Test1 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.exp = 25;
        doc.eat();
        doc.sleep();
        doc.fix();
    }

}

class Employee {
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
class Hirurg extends Doctor {
    String scalp;
    void operation(){}
}
class Dantist extends Doctor {
    String toothScalp;
}

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