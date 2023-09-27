package Lesson11;

public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    public int plusDoor(int a) {
        doors = doors + a;
        return doors;
    }

    public static void changecol(Car s1, Car s2) {
        String s3 = s1.color;
        s1.color = s2.color;
        s2.color = s3;
    }
}

class CarTest {
    public static void main(String[] args) {

        Car c1 = new Car("Red", "V8", 2);
        Car c2 = new Car("Black", "V6", 4);
        c1.plusDoor(2);
        c2.plusDoor(2);
        Car.changecol(c1, c2);
        System.out.println("Car1 Color : " + c1.color + " Engine: " + c1.engine + " Doors: " + c1.doors);
        System.out.println("Car2 Color : " + c2.color + " Engine: " + c2.engine + " Doors: " + c2.doors);
    }
}