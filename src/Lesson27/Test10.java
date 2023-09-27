package Lesson27;

import java.io.*;

public class Test10 {
    FileInputStream fis1, fis2;
    public void abc() {
        try{
            fis1 = new FileInputStream("test9.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test10 not founded");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test9 not founded");
        } finally {
            System.out.println("This is outter finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Exception founded in finally block!");
            }
        }
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        t.abc();
    }
}
