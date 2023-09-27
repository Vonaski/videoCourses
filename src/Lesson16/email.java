package Lesson16;

import java.util.Arrays;

public class email {
    public static void emailselect(String op) {
        op = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        System.out.println(op.substring(3, 8));
        System.out.println(op.substring(17, 21));
        System.out.println(op.substring(30, 35));
    }

    public static void main(String[] args) {
        emailselect("da");
    }

}
