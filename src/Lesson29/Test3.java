package Lesson29;

public class Test3 {
    static void def(Te t) {
        System.out.println(t.abc("Hello"));
    }

    public static void main(String[] args) {
        def(x -> x.length());
    }
}

interface Te {
    int abc(String s);
}