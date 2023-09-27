package Lesson27;

public class Test14 {
//    static {
//        int a = Integer.parseInt("12e");
//    } // ExceptionInInitializerError, если в статик ините выбрасывается именно runtime exception
//    static String s = null;
//    static int a = s.length();

    static String s = abc();
    static String abc() {
        String[] array = {"1", "2", "3"};
        return array[100];
    }

    public static void main(String[] args) {

    }
}
