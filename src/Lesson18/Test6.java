package Lesson18;

import java.util.Arrays;

public class Test6 {
    public static void sortirovka(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 3, 1, 6, 2};
        sortirovka(array);
        System.out.println(array[0]);
    }
}
