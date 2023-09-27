package Lesson14;

public class Test6 {
    public static void time() {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (minuta == 20) {
                    continue OUTER;
                }
                System.out.println(chas + ":" + minuta);
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
