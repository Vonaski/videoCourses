package Lesson8;

public class Zadacha2 {
   public final static double Pi = 3.14;

   public double ploshad(double radius){
       double pl = Pi * radius * radius;
       return pl;
   }
   public static double dlina(double radius2){
       double dl = 2 * Pi * radius2;
       return dl;
   }
   public void info(double radius3){
       System.out.println("Радиус: " + radius3);
       System.out.println("Длина: " + dlina(radius3));
       System.out.println("Площадь: " + ploshad(radius3));
   }
}
class Zadacha2Test{
    public static void main(String[] args) {
        Zadacha2 z = new Zadacha2();
        z.ploshad(5);
        Zadacha2.dlina(7.5);
        z.info(3);
    }
}
