package Lesson22;

public class Test2 {

}

class Human2 {
    Human2(String name) {
        this(name, null);
    }

    Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String name;
    String surname;
}

class Student2 extends Human2 {
    Student2() {
        this(5);
        System.out.println("Hello");
    }

    Student2(int i) {
        super("Pitr");
    }

    public static void main(String[] args) {
        Student2 s = new Student2();

    }
}