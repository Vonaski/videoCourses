package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Zaur");
        al.add("Ivan");
        al.add("Mariya");
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>(200);
        al2.add("Zaur");
        al2.add("Ivan");
        List<String> l = new ArrayList<>();
        List<String> l1 = new ArrayList<>(al);
        System.out.println(l1);
    }
}
