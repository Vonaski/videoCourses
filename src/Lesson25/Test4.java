package Lesson25;

public class Test4 {
    public static void main(String[] args) {
        String[] array1 = {"Hello", "Bye"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
    }
}
