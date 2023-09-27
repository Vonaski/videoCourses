package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        List<? super Number> list5 = new ArrayList<Number>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Ok");
        list2.add("Good");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(sum(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(sum(ali));
    }
    static void showListInfo(List<?> list) {
        System.out.println("My list have: " + list);
    }
    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
