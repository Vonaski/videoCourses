package Collection.LinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);
        LinkedList<Student2> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("Igor", 4);
        linkedList.add(st6);
        System.out.println(linkedList);
        linkedList.add(1, st7);
        System.out.println(linkedList);
        linkedList.remove(3);
        System.out.println(linkedList);
    }
}
class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}