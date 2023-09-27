package Lesson26;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8");
        Car c4 = new Car("Black", "V8");
        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(c3);
    }
}
class Car {
    String color;
    String engine;
    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car) obj;
            return (color.equals(c.color) && engine.equals(c.engine));
        } else {
            return false;
        }
    }
    public String toString() {
        return "Color " + color + " Engine " + engine;
    }
}