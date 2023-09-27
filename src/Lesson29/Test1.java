package Lesson29;

import java.util.ArrayList;

public class Test1 {

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
//        FindStudentsOverGrade fs = new FindStudentsOverGrade();
//        FindStudentsBySex fsbx = new FindStudentsBySex();
//        FindStudentsOverAge fsov = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsMix fsm = new FindStudentsMix();
//
//        sI.testStudents(list, fs);
//        System.out.println("-------------------------------------------------");
//        sI.testStudents(list, fsbx);
//        System.out.println("-------------------------------------------------");
//        sI.testStudents(list, fsm);
//        System.out.println("-------------------------------------------------");
//        sI.testStudents(list, fsua);
//        System.out.println("-------------------------------------------------");
//        sI.testStudents(list, fsov);
//
//    }
//}
//interface StudentChecks {
//    boolean testStudent(Student s);
//}
//class FindStudentsOverGrade implements StudentChecks {
//    public boolean testStudent(Student s) {
//        return s.avgGrade > 8.5;
//    }
//}
//class FindStudentsUnderGrade implements StudentChecks {
//    public boolean testStudent(Student s) {
//        return s.avgGrade < 9;
//    }
//}
//class FindStudentsOverAge implements StudentChecks {
//    public boolean testStudent(Student s) {
//        return s.age > 25;
//    }
//}
//class FindStudentsUnderAge implements StudentChecks {
//    public boolean testStudent(Student s) {
//        return s.age < 27;
//    }
//}
//class FindStudentsBySex implements StudentChecks {
//    public boolean testStudent(Student s) {
//        return s.sex == 'm';
//    }
//}
//class FindStudentsMix implements StudentChecks {
//    public boolean testStudent(Student s) {
//        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
//    }
//}