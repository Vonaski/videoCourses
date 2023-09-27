package Lesson6;

public class RunTimeErrors {
    void summa(double a){
        System.out.println(a);
    }
    void summa(double a, double b){
        System.out.println(a+b);
    }
    void summa( double a, double b, double c){
        System.out.println(a+b+c);
    }
    void summa(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }
    void summa(double a, double b, double c, double d, double e){
        System.out.println(a+b+c+d+e);
    }
}
class RunTest{
    public static void main(String[] args) {
        RunTimeErrors qwer = new RunTimeErrors();
        qwer.summa(0);
        qwer.summa(1,2);
        qwer.summa(1,2,3);
        qwer.summa(1,2,3,4);
        qwer.summa(1,2,3,4,5);
    }
}
