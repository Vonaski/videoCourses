package Lesson25.Homework;

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
    public void swim() {
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
        Animal a1 = new Swordfish("Karl1");
        Animal a2 = new Penguin("Kavalski1");
        Animal a3 = new Lion("Leva1");
        Fish f1 = new Swordfish("Karl2");
        Bird b1 = new Penguin("Kavalski2");
        Mammal m1 = new Lion("Leva2");
        Swordfish sw1 = new Swordfish("Karl3");
        Penguin p1 = new Penguin("Kavalski3");
        Lion l1 = new Lion("Leva3");
        Speakable sp1 = new Penguin("Kavalski4");
        Speakable sp2 = new Lion("Leva4");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, sw1, p1, l1};
        Speakable[] array2 = {b1, m1, p1, l1, sp1, sp2};
        for (Animal a : array1){
            if (a instanceof Swordfish){
                Swordfish sw = (Swordfish) a;
                System.out.println(sw.name);
                sw.eat();
                sw.sleep();
                sw.swim();
            } else if (a instanceof Penguin) {
                Penguin p = (Penguin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("--------------------------------------------------------------------------");
        }
        for (Speakable s : array2){
            if (s instanceof Penguin){
                Penguin p = (Penguin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (s instanceof Lion) {
                Lion l = (Lion) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            } else if (s instanceof Swordfish) {
                Swordfish sw = (Swordfish) s;
                System.out.println(sw.name);
                sw.eat();
                sw.sleep();
                sw.swim();
            }
            System.out.println("-------------------------------------------------------------------------");
        }
    }
}
