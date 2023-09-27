package Lesson12;

public class Car {
    int engine;
    int doors;

    Car(int engine, int doors){
        this.engine = engine;
        this.doors = doors;
    }

}
class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car(3,4);
        Car c2 = new Car(2,5);

        if(c1.engine > c2.engine){
        if(c1.doors > c2.doors){
            System.out.println("Мотор и двери 1машины больше");}
        else{
            System.out.println("Мотор лучше, двери меньше");}}
        else{
            System.out.println("Мотор меньше");}



    }
}