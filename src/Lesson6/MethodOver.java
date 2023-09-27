package Lesson6;

public class MethodOver {
    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public String sum(String s1, String s2) {
        return s1 + s2;
    }
}
class MethodOver2{
    public static void main(String[] args) {
        MethodOver mo = new MethodOver();
        int a = mo.sum(5,7);
        System.out.println(a);
        String s = mo.sum("Hello", " my friend");
        System.out.println(s);

    }
}
