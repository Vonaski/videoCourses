package Lesson24.Homework;

public abstract class Animal {
    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        super.name = name;
    }

    @Override
    void sleep() {
        System.out.println("It's always interesting to watch fish sleep!");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        super.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " sings!");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        super.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks!");
    }
}

class Swordfish extends Fish {
    Swordfish(String name) {
        super(name);
        super.name = name;
    }

    @Override
    void swim() {
        System.out.println("Swordfish is a beautiful fish that swims fast!");
    }

    @Override
    void eat() {
        System.out.println("Swordfish is not a predatory fish and it eats regular fish food!");
    }
}

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
        super.name = name;
    }

    @Override
    void eat() {
        System.out.println("Penguin loves to eat fish!");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep cuddled together!");
    }

    @Override
    void fly() {
        System.out.println("Penguins can't fly!");
    }

    @Override
    public void speak() {
        System.out.println("Penguins can't sing like nightingales");
    }
}

class Lion extends Mammal {
    Lion(String name) {
        super(name);
        super.name = name;
    }

    @Override
    void eat() {
        System.out.println("A lion, like any predator, loves meat!");
    }

    @Override
    void sleep() {
        System.out.println("The lion sleeps most of the day!");
    }

    @Override
    void run() {
        System.out.println("Lion is not the fastest cat!");
    }
}

class Test {
    public static void main(String[] args) {
        Swordfish sw = new Swordfish("Nemo");
        System.out.println(sw.name);
        sw.eat();
        sw.swim();
        sw.sleep();
        System.out.println();

        Speakable pngv = new Penguin("Kavalski");
        pngv.speak();
        System.out.println();

        Animal ln = new Lion("Simba");
        System.out.println(ln.name);
        ln.eat();
        ln.sleep();
        System.out.println();

        Mammal ln2 = new Lion("Pushok");
        System.out.println(ln2.name);
        ln2.eat();
        ln2.sleep();
        ln2.run();
        ln2.speak();
    }
}
