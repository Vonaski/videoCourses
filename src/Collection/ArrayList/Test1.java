package Collection.ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Leo");
        arrayList.add("Kosto");
        arrayList.add("Uncle");
        arrayList.add("Wizzard");
        arrayList.add("Berchig");
        arrayList.add(1, "Michael");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrayList.get(2));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        arrayList.set(1, "Masha");  // заменяет элемент с индексом 1 и т.д
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
