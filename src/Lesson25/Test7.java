package Lesson25;

public class Test7 {
}
class Test implements i1, i2{
    public void abc(){
        System.out.println("Ok");
    }
    public static void main(String[] args) {
        Test t = new Test();
        ((i1)t).abc();
        System.out.println(((i2)t).a);
    }
}
interface i1 {
    int a = 5;
    void abc();
}
interface i2 {
    int a = 10;
    void abc();
}