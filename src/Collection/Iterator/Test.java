package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Leo");
        arrayList.add("Kosto");
        arrayList.add("Uncle");
        arrayList.add("Wizzard");
        arrayList.add("Uncle");
        arrayList.add("Berchig");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList.isEmpty());
    }
}
