package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showcolor(){
        System.out.println("Car color: " + color);
    }
    public void changecolor(String color3){
        System.out.println("Color changed: ");
        int price = 5000;
        color = color3;
        price += 1000;
    }


}
