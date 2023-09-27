package Lesson29;

import java.util.ArrayList;
public class Test {
}
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//    Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//class StudentInfo {
//    static void printStudent(Student st) {
//        System.out.println("Name: " + st.name + ". Sex: " + st.sex + ". Age: " + st.age + ". Course: " + st.course + ". Average grade: " + st.avgGrade);
//    }
//    void printStudentsOverGrade(ArrayList<Student> al, double avgGrade){
//        for (Student s : al) {
//            if (s.avgGrade > avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsUnderGrade(ArrayList<Student> al, double avgGrade){
//        for (Student s : al) {
//            if (s.avgGrade < avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsOverAge(ArrayList<Student> al, int age){
//        for (Student s : al) {
//            if (s.age > age) {
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> al, int age){
//        for (Student s : al) {
//            if (s.age < age) {
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentBySex(ArrayList<Student> al, char sex){
//        for (Student s : al) {
//            if (s.sex == sex) {
//                printStudent(s);
//            }
//        }
//    }
//    void printStudentsMixConditions(ArrayList<Student> al, double avg, int age, char sex) {
//        for (Student s : al) {
//            if (s.avgGrade > avg && s.age < age && s.sex == sex) {
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
//        sI.printStudentsOverGrade(list, 8.5);
//        System.out.println("----------------------------------------------------------------------------");
//        sI.printStudentsUnderGrade(list, 9);
//        System.out.println("----------------------------------------------------------------------------");
//        sI.printStudentsOverAge(list, 25);
//        System.out.println("----------------------------------------------------------------------------");
//        sI.printStudentsUnderAge(list, 27);
//        System.out.println("----------------------------------------------------------------------------");
//        sI.printStudentBySex(list, 'm');
//        System.out.println("----------------------------------------------------------------------------");
//        sI.printStudentsMixConditions(list, 7.2, 23, 'f');
//    }
//}