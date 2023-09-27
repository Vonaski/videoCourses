package Lesson25;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        final int i1 = 3;
        short s = i1;
        byte b1 = i1;
        long l = 1;
        int i2 = (int) l;
        char c10 = (char) -654;
        System.out.println(c10);
        double d12 = 923234.432412341;
        byte b2 = (byte) d12;
        System.out.println(b2);
        int i3 = 2147483647;
        System.out.println(i3 + 1);
        int i4 = 5;
        long l1 = 10;
        i4 *= l1;
    }
}
