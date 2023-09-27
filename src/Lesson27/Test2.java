package Lesson27;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        File f = new File("test9.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Have a good day!");
        } catch (FileNotFoundException e) {
            System.out.println("Exception was catch! " + e);
        } finally {
            System.out.println("This block is finally!");
        }
        System.out.println("This code is not related to exceptions!");
    }
}
