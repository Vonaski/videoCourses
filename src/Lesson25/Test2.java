package Lesson25;

public class Test2 {
    public static void main(String[] args) {
        Jumoable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jumoable){System.out.println("j is Jumpable");}
        if (m instanceof Human){System.out.println("m is Human");}
//        if (s instanceof Human){System.out.println("s is Human");} // Ошибка компилятора
        if (s instanceof Jumoable){System.out.println("s is Jumpable");} // Компилятор не знает ссылается ли s на суперкласс или на сабкласс(возможно сабкласс имплеминтировал jumpable)
    }
}

interface Jumoable {}
class Human implements Jumoable {}
class Man extends Human {}
class Student {}
