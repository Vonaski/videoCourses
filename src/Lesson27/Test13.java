package Lesson27;

import java.util.ArrayList;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        System.out.println(list.get(3)); // IndexOutOfBoundsException

//        System.out.println(5/0); // ArithmeticException

        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Teacher t1 = new Teacher();
        Teacher[] array = {t, t1};
        Employee[] array1 = {d, t, t1};
//        Teacher t2 = (Teacher) array1[0]; // ClassCastException
//        Airplane a = new Airplane();
//        a.fly();
//        a.pend();
        Integer.parseInt("44ab", 16); // NumberFormatException, но если указать 16-ричная система счисления то всё работает

    }
    public static void createPswrd(String pswrd) {
        if (pswrd.length() < 6) {
            throw new IllegalArgumentException("Short pswrd length");
        }
        if (pswrd.length() > 12) {
            throw new IllegalArgumentException("Long pswrd length");
        }
        System.out.println("Password accepted!");
    }
}
class Employee {}
class Doctor extends Employee{}
class Teacher extends Employee{}

class Airplane {
    String state = "pending"; // pending, in the air, flight canceled
    public void fly() {
        state = "in the air";
        System.out.println("Airplane in the air!");
    }
    public void pend(){
        if (state.equals("in the air")) {
            throw new IllegalStateException("Airplane already in the air!");
        }
        state = "pending";
        System.out.println("Airplane is pending!");
    }
    public void flightCancel() {
        if (state.equals("in the air")) {
            throw new IllegalStateException("Airplane already in the air!");
        }
        state = "Flight canceled";
        System.out.println("Flight canceled!");
    }
}