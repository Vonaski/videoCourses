package Lesson24;

public class Test6 {
}
interface I2 {
    default void def(){
        System.out.println("It's method def");
    }
    static void abc(){
        System.out.println("Static method I2");
    }
}
interface I4 {
    static void abc(){
        System.out.println("Static method I4");
    }
}
interface I3 extends I2 {
    void def();
}
abstract class R implements I2{
    abstract public void def();
}
class D implements I2, I4 {
    public static void main(String[] args) {
        I2.abc();
        I4.abc();
    }
}