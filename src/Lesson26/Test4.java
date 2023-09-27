package Lesson26;

public class Test4 {
    {
        System.out.println("This is init block 3!");
    }
    Test4(){
        System.out.println("This is constructor 1!");
    }
    Test4(int a){
        this();
        System.out.println("This is constructor 2!");
    }

    {
        System.out.println("This is init block 1!");
    }
    static {
        System.out.println("This is static init block 1!");
    }
    {
        System.out.println("This is init block 2!");
    }
    static {
        System.out.println("This is static init block 2!");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Test4 t1 = new Test4(3);

    }
}
