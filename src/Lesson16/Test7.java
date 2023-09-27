package Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "privet";//String pool
        String s4 = "privet";//String pool
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 != s4);

        String s5 = "Kak Dela?";
        String s6 = "kak dela?";
        System.out.println(s5.equalsIgnoreCase(s6)); // Без разницы большие буквы или маленькие

        String x = "privet";
        String y = "privet".trim();
        System.out.println(x == y);
    }
}
