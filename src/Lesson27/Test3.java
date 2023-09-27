package Lesson27;

import java.io.*;

public class Test3 {
    void abc() throws FileNotFoundException {
        File f = new File("test9.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Have a good day!");
    }
    void def() {
        System.out.println("Hello");
        try {
            abc();
        } catch (FileNotFoundException e){
            System.out.println("Exception was catch! " + e);
        }
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.def();
    }
}
