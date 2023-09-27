package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception was catch!");
            throw e;
        } finally {
            System.out.println("This is finally block!");
        }
    }
    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception was catch!");
        }
    }
}
