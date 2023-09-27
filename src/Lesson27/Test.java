package Lesson27;

public class Test {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}
class Animal {
    int a = 5;
    static int b = 10;
    void abc() {
        System.out.println("Non-static method in Animal class");
    }
    static void def() {
        System.out.println("Static method in Animal class");
    }
}
class Tiger extends Animal {
    int a =15;
    static int b = 20;
    void abc() {
        System.out.println("Non-static method in Tiger class");
    }
    static void def() {
        System.out.println("Static method in Tiger class");
    }
}