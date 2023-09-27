package Collection.TreeMap;

import java.util.Objects;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        treeMap.put(st1, 5.8);
        treeMap.put(st7, 9.1);
        treeMap.put(st2, 6.4);
        treeMap.put(st4, 7.5);
        treeMap.put(st3, 7.2);
        treeMap.put(st6, 8.2);
        treeMap.put(st5, 7.9);
        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(7.3));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
    }
}
class Student implements Comparable<Student> {
    String name;
    String surname;
    int course;
    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}