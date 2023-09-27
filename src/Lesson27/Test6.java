package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("File is created.");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream is created.");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Information is reading!");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("This is finally");
        }
        System.out.println(result);
    }
}
