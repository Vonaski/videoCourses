package Lesson13;

public class Month {
    public static void whichMonth(int a){
        switch (a){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:

            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }
    }

    public static void main(String[] args) {
        whichMonth(9);
    }

}
