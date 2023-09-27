package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;


    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student number " + count + " created");
    }

    public static void showCount() {
        System.out.println("Created students: " + count);
    }
    public void showInfo(){
        System.out.println("Welcome to the student class!");
    }

    public static void main(String[] args) {

    }
}