package Lesson22.Homework;

public class Animal {
    public Animal() {
        System.out.println("I'm animal.");
    }
    public int eyes;
    public void eat() {
        System.out.println("Animal eats");
    }
    public void drink() {
        System.out.println("Animal drinks");
    }
}
class Pet extends Animal {
    public Pet(){
        System.out.println("I'm pet");
        eyes = 2;
    }
    public String name;
    public int tail = 1;
    public int paw = 4;
    public void run(){
        System.out.println("Pet runs");
    }
    public void jumo(){
        System.out.println("Pet jumps");
    }
}class Dog extends Pet {
    public Dog(String name){
        this.name = name;
        System.out.println("I'm dog and my name is: " + name);
    }
    public void play(){
        System.out.println("Dog plays");
    }
}
class Cat extends Pet {
    public Cat(String name){
        this.name = name;
        System.out.println("I'm cat and my name is: " + name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
class AnimalTest {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        System.out.println("I have: " + rex.paw + " paw's");
        Cat sima = new Cat("Sima");
        sima.sleep();
    }
}