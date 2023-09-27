package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        Qwerty<Double> info1 = new Qwerty<>(3.14);
//        System.out.println(info1);
//        Double d = info1.getValue();
//        System.out.println(d);
//
//        Qwerty<Integer> info2 = new Qwerty<>(18);
//        System.out.println(info2);
//        Integer i1 = info2.getValue();
//        System.out.println(i1);
    }
}
class Qwerty <T extends Number & i1 & i2> {
    private T value;
    public Qwerty(T value) {
        this.value = value;
    }
    public String toString() {
        return "{ [" + value + "] }";
    }
    public T getValue() {
        return value;
    }
}
interface i1 {}
interface i2 {}