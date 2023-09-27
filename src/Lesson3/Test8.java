package Lesson3;

public class Test8 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = i2 / d1 + d2 % i1 - l;

        int a = 5;
        int a2 = a-- - --a + ++a + a++ + a;
        int b = 8;
        int b2 = ++b - b++ + ++b - --b;

        System.out.println(b2);

    }
}
