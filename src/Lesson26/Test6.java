package Lesson26;

public class Test6 {
    public static void main(String[] args) {
        Lion l = new Lion();
    }
}
class Animal {
    Animal(){
        System.out.println("Constructor of Animal!");
    }
    static {System.out.println("Static init in Animal class!");}
    {System.out.println("Non-static init in Animal calss!");}
}
class Mammal extends Animal {
    Mammal(){
        System.out.println("Constructor of Mammal!");
    }
    static {System.out.println("Static init in Mammal class!");}
    {System.out.println("Non-static init in Mammal calss!");}
}
class Lion extends Mammal {
    Lion(){
        System.out.println("Constructor of Lion!");
    }
    static {System.out.println("Static init in Lion class!");}
    {System.out.println("Non-static init in Lion calss!");}
}