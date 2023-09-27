package Lesson6;

public class MethodOverLoading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }
    void show(String s, int a){
        System.out.println("String: " + s + "int: " + a);
    }
    void show(int a, String s){
        System.out.println("Very good day!");
    }


}

class MethodOverl {
    public static void main(String[] args) {
        MethodOverLoading mO = new MethodOverLoading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Hello";
        mO.show(s);
        mO.show("Hello ", 10);
        mO.show(10, "Hello");

    }
}
