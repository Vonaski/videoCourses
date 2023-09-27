package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s = new String("privet");

        String s1 = s.substring(3);
        System.out.println(s1);

        String s2 = s.substring(3,6);
        System.out.println(s2);

        String s3 = s.trim();//Убирает пустые пробелы по бокам, но не по середине!
        System.out.println(s3);

        String s4 = s.replace('r', 'Z');
        System.out.println(s4);

        String s5 = s.replace("vet", "sunul");
        System.out.println(s5);

        String s6 = "privet, ";
        String s7 = "drug";
        System.out.println(s6.concat(s7));
    }
}
