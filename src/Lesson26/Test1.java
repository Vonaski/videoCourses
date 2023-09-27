package Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
        System.out.println(a);

        Integer b = new Integer(10);
        int c = b;

        Number n = new Integer(15);
        int i = (Integer) n;

        String s1 = "    50   ";
        int i1 = Integer.parseInt(s1.trim());
        System.out.println(i1);

        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);

        String s3 = "3.14  ";
        double d1 = Double.parseDouble(s3.trim());
        System.out.println(d1);

        Integer i3 = Integer.valueOf(2);
        System.out.println(i3);

        Double d2 = Double.valueOf(s3.trim());
        System.out.println(d2);

        Byte b3 = new Byte((byte) 5);
        Byte b4 = Byte.valueOf((byte) 5);

    }
}
