package Lesson27;

import java.io.*;

public class Test15 {

}

class Animal2 {
    Animal2() throws FileNotFoundException {
    }
    void run() throws IOException {
        System.out.println("Animal runs!");
    }
}
class Mouse extends Animal2 {
    Mouse() throws IOException{
        super();
    }
    void run() throws FileNotFoundException, ArrayIndexOutOfBoundsException, NullPointerException {
        System.out.println("Mouse runs!");
    }
}

class Human {
    String name;
    int age;
    Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("Incorrect name");
        }
        this.name = name;
        this.age = age;
    }
}