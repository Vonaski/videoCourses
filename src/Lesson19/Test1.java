package Lesson19;

public class Test1 {
   static void summa(int ... a){
       int summa = 0;
       for (int i = 0; i < a.length; i++){
           summa += a[i];
       }
       System.out.println(summa);
   }

    public static void main(String[] args) {
        summa(5,3,2);
    }
}
