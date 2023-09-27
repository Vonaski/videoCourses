package Lesson27;

public class Test11 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}
