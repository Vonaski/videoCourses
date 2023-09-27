package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.set(1, "!!!");
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        list.addAll(1,list2);
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.indexOf("!!!"));

            list.clear();
            System.out.println();
            System.out.println();
            for (String a : list){
                System.out.print(a + " ");
            }


    }
}
