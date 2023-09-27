package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
//        list.add("Ok");
//        list.add(5);
//        list.add(new StringBuilder("eadfewdf"));
//        list.add(new Car());
        list.add("Hello");
        list.add("Bye");
        list.add("Ok");
        list.add("Endlessly");
        for (Object o : list) {
            System.out.println(o + ". Length: " + ((String)o).length());
        }
    }
}
class Car {

}