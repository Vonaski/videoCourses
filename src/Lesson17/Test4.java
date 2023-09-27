package Lesson17;

public class Test4 {
    public static boolean ravenstvo(StringBuilder s1, StringBuilder s2){
        if (s1 == s2){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1;
        ravenstvo(sb1, sb2);
    }
}
