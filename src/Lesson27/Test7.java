package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {
    static int abc(){
        try {
            File f = new File("test1.txt");
            FileInputStream fis = new FileInputStream(f);
//            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception was catch!");
            return 6;
        } finally {
            System.out.println("This is finally block!");
            return 7;
        }
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
