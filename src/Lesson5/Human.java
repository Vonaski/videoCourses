package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Name: " + name + " Car: " + car.color + " " + car.engine + " Balance: " + bA.balance);
    }
}
class HumanTest{
    public static void main(String[] args) {
        Human Vonaski = new Human();
        Vonaski.name = "Ilyas";
        Vonaski.car = new Car3("Red", "V8");
        Vonaski.bA = new BankAccount(18, 200.5);
        Vonaski.info();

    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int i, double b) {
        id = i;
        balance = b;
    }

    int id;
    double balance;
}