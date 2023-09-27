package Lesson22;

public class Humans {
    protected String name;
    protected static int salary = 150;
    protected void work(){
        System.out.println("work");
    }
    protected static void rest (){
        System.out.println("rest");
    }
}
class Student extends Humans {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Jason";
        System.out.println(s.name);
        System.out.println(salary);
        s.work();
        rest();
    }
}