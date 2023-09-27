package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        int a = s1.length(); //Количество индексов
        System.out.println(a);

        char c = s1.charAt(3);//Номер индекса
        System.out.println(c);

        int i = s1.indexOf('f');//На каком индексе находится символ
        System.out.println(i);

        int i1 = s1.indexOf("def");
        System.out.println(i1);

        int i2 = s1.indexOf("a",5);//Также можно указать не стринг с "" а чар с ''
        System.out.println(i2);

        boolean b = s1.startsWith("abc");
        System.out.println(b);

        boolean b1 = s1.startsWith("abc", 7);
        System.out.println(b1);

        boolean b2 = s1.endsWith("cd");
        System.out.println(b2);


    }
}
