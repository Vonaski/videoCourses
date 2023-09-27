package Lesson12;

public class Test11 {
    void maximum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Maximum: " + a);
        } else if (b > a && b > c) {
            System.out.println("Maximum: " + b);
        } else {
            System.out.println("Maximum: " + c);
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.maximum(4, 7, 0);
    }
}
