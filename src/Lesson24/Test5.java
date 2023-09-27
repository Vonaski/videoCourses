package Lesson24;

public class Test5 {
}
interface I1 {
    void abc ();
    default void def(){
        System.out.println("It's method def");
    }
}
class Z implements I1 {
    @Override
    public void abc() {
        System.out.println("Overrided method abc");
    }

    public static void main(String[] args) {
        Z z = new Z();
        z.abc();
        z.def();
    }
}