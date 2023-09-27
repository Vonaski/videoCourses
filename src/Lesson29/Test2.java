package Lesson29;

import java.util.ArrayList;

public class Test2 {
}

//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    static void printStudent(Student st) {
//        System.out.println("Name: " + st.name + ". Sex: " + st.sex + ". Age: " + st.age + ". Course: " + st.course + ". Average grade: " + st.avgGrade);
//    }
//
//    void testStudents(ArrayList<Student> al, StudentChecks sc) {
//        for (Student s : al) {
//            if (sc.testStudent(s)) {
//                printStudent(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
//        Student st2 = new Student("Kolya", 'm', 28, 2, 6.4);
//        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
//        Student st4 = new Student("Petr", 'm', 35, 4, 7);
//        Student st5 = new Student("Marya", 'f', 23, 3, 9.1);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo sI = new StudentInfo();
//
//        sI.testStudents(list, (Student st) -> {
//            return st.avgGrade > 8.5;
//        });
//        System.out.println("-------------------------------------------------");
//
//        sI.testStudents(list, st ->
//                st.sex == 'm');
//        System.out.println("-------------------------------------------------");
//
//        sI.testStudents(list, (Student st) -> {
//            return st.age > 23;
//        });
//        System.out.println("-------------------------------------------------");
//
//        sI.testStudents(list, (Student st) -> {
//            return st.avgGrade < 9;
//        });
//        System.out.println("-------------------------------------------------");
//
//        sI.testStudents(list, (Student st) -> {
//            return st.age < 27 && st.avgGrade > 7.5;
//        });
//    }
//}
//
//interface StudentChecks {
//    boolean testStudent(Student s);
//}