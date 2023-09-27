package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figure f1 = new Square();
        System.out.println(f1.sides);
        f1.area();
    }
}
abstract class Figure {
    int sides = 0;
    abstract void Perimeter();
    abstract void area();
    void showInfo() {
        System.out.println("It's figure");
    }
}
class Square extends Figure {
    int sides = 4;
    int side1 = 10;
    public void Perimeter() {
        System.out.println("The perimeter of a square is: " + 4 * side1);
    }
    public void area() {
        System.out.println("The area of a square is: " + side1 * side1);
    }
}
class Rectangle extends Figure {
    int sides = 4;
    int side1 = 10;
    int side2 = 5;
    public void Perimeter() {
        System.out.println("The perimeter of a rectangle is: " + 2 * (side1+side2));
    }
    public void area() {
        System.out.println("The area of a rectangle is: " + side1 * side2);
    }
}

class Circle extends Figure {
    int sides = 0;
    int radius = 3;
    public void Perimeter() {
        System.out.println("The perimeter of a circle is: " + 2 * 3.14 * radius);
    }
    public void area() {
        System.out.println("The area of a circle is: " + 3.14 * radius * radius);
    }
}