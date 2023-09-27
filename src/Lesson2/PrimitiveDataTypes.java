package Lesson2;

import java.io.PrintWriter;
import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 0_14;
        byte b4 = 0xC;

        short s1 = -1300;

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;

        long l1 = 123456789L;
        long l2 = 0b0111010110111100110100010101L;
        long l3 = 0726746425L;
        long l4 = 0x75BCD15L;

        float f1 = 0.35F;
        float f2 = 20;

        double d1 = 0.35;
        double d2 = 432.984;

        boolean bool1 = false;
        boolean bool2 = true;

        char c2 = 'Ĭ';
        char c1 = 300;
        char c3 = '\u012C';



        boolean[] barray = {
                false,
                true,
                true
        };

        // 0 1 2 3 4
        //[12][0][0][22][0]

        System.out.print(barray[1]);
    }
}
