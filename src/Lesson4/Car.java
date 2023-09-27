package Lesson4;

public class Car {
    Car() {
        Color = "Blue";
        Engine = "V12";
    }

    String Color;
    String Engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = new Car();
        car2.Engine = "V6";
        car2.Color = "Black";

        System.out.println(car1.Color);
        System.out.println(car1.Engine);
        System.out.println(car2.Color);
        System.out.println(car2.Engine);
    }
}

