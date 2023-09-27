package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("hello"));
        for (String sb : list){
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("poka"));
        System.out.println(list.toString());
    }
}
