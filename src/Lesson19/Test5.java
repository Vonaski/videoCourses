package Lesson19;

public class Test5 {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};
        for (int[] array1 : array) {
            for (int a : array1) {
                System.out.print(a + " ");
            }
        }
    }
}
