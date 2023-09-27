package Lesson14;

public class Test8 {
    public static void time() {
        OUTER:
        for (int chas = 0; chas < 6; chas++) {
            MIDDLE:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int sekunda = 0; sekunda <= 59; sekunda++) {
                    if (sekunda * chas > minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
