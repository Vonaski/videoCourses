package Lesson27;

import java.io.*;

public class Test4 {
    void abc(){
        int[] array = {1, 2};
        System.out.println(array[5]);
    }
    void def() throws ArrayIndexOutOfBoundsException{
        abc();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        try {
            t.def();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception was catch!");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
