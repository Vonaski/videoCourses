package Collection.Vactor;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Katiya");
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
