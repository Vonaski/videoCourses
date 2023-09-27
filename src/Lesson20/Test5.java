package Lesson20;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
//        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();
//        System.out.println(list.get(0) == list2.get(0));
//        list.get(0).append("!");
//        list.set(0, new StringBuilder("D"));
//        System.out.println(list2.get(0));
        Object[] array1 = list.toArray();
        for (Object o : array1) {
            System.out.println(o);
        }
        StringBuilder[] array2 = list.toArray(new StringBuilder[10]);
        for (StringBuilder sb : array2) {
            System.out.println(sb);
        }
        StringBuilder[] array = {sb2, sb3, sb3, sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
        array[0] = new StringBuilder("!!!");
        System.out.println(list8);

    }
}
