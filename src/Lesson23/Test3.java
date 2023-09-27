package Lesson23;

import Lesson22.Homework.Animal;

public class Test3 {
}
class Hayvan {
    String showName(){
        return "Rabbit";
    }
    void showInfo(){
        System.out.println("Name of animal: " + showName());
    }
}
class Mouse extends Hayvan {
    @Override
    String showName(){
        return "Mouse";
    }
    public static void main(String[] args) {
        Hayvan h = new Mouse();
        h.showInfo();
    }
}