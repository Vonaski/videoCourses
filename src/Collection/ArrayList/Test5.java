package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Leo");
        arrayList.add("Kosto");
        arrayList.add("Uncle");
        arrayList.add("Wizzard");
        arrayList.add("Uncle");
        arrayList.add("Berchig");

        ArrayList<String> al = new ArrayList<>();
        al.add("Kosto");
        al.add("Uncle");
//        al.add("Igor");

//        arrayList.retainAll(al);
//        arrayList.removeAll(al);

        boolean result = arrayList.containsAll(al);
        System.out.println(result);

        List<String> myList = arrayList.subList(1, 4);
        System.out.println(myList);
        myList.add("Fedor");
        System.out.println(myList);
        System.out.println(arrayList);
        arrayList.add("Sveta");
//        System.out.println(arrayList);
//        System.out.println(myList);

        Object[] array = arrayList.toArray();
        String[] array1 = arrayList.toArray(new String[0]);
        for (String s : array1) {
            System.out.print(s + " ");
        }
        System.out.println();

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
//        list1.add(100);

        List<String> list2 = List.copyOf(arrayList);
        System.out.println(list2);
    }
}
