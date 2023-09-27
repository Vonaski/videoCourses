package Lesson14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            if (i % 9 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
