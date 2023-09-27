package Lesson23;

public class Test4 {
}
class Hayvanlar {
    static String showName(){
        return "Rabbit";
    }
    void showInfo(){
        System.out.println("Name of animal: " + showName());
    }
}
class Mish extends Hayvanlar {
    static String showName(){
        return "Mouse";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mish h = new Mish();
        h.showInfo();
        h.showInfoAboutMouse();
    }
}