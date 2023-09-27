package Lesson18;

public class Test1 {
    public static void main(String[] args) {
        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array10 = new int[3][3];

        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][];

        array2[0] = "Privet";
        array2[1] = "Poka";
        array2[2] = "Ok";

        double[] array4;
        array4 = new double[2];
        array4[0] = 2.5;
        array4[1] = 3.5;
        array3[1] = array4;
        System.out.println(array3[1][1]);
    }
}
