package Lesson8;

public class Homework {
    public static int abc(int a, int b, int c) {
        return a * b * c;
    }

    public static void qwer(int d, int e) {
        int result = d / e;
        int result2 = d % e;
        System.out.println("Integer result: " + result);
        System.out.println("Remainder: " + result2);
    }
}

class Testhome {
    public static void main(String[] args) {
        System.out.println(Homework.abc(1, 2, 3));
        Homework.qwer(7, 2);
    }
}
