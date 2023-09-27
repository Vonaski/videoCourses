package Lesson20;

import java.util.*;
import java.util.Collections;

public class Test8 {
    public ArrayList<String> abc (String ... s){
        ArrayList<String> aL = new ArrayList<>();
        for (String s1 : s){
            if (!aL.contains(s1)){
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        Test8 t8 = new Test8();
        t8.abc("Hello", "Ok", "Bye", "Good", "Ok", "WTF", "Hello");
    }
}
