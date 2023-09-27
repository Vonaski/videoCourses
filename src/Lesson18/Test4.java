package Lesson18;

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array3[] = array2;
        System.out.println(array3 == array2);
        System.out.println(array1.equals(array2));

        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello World");
//        sb.append(array, 2, 3);
        sb.insert(2, array, 1, 3);
        System.out.println(sb);


    }
}
