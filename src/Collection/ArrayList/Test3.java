package Collection.ArrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add("Leo");
        arrayList1.add("Kosto");
        arrayList1.add("Uncle");
        arrayList1.add("Wizzard");
        arrayList1.add("Uncle");
        arrayList1.add("Berchig");

        arrayList2.add("!!!");
        arrayList2.add("???");

        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        arrayList2.clear();
        System.out.println(arrayList2);

        int i = arrayList1.indexOf("Uncle");
        System.out.println(i);

        System.out.println(arrayList1.lastIndexOf("Uncle"));

        System.out.println(arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList2.isEmpty());
        System.out.println(arrayList1.contains("Kosto"));
    }
}
