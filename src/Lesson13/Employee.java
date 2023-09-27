package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Sunday"){
            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                System.out.println("Work until 18:00");
                break;
            case "Saturday":
                System.out.println("Work until 14:00");
                break;
            case "Sunday":
                System.out.println("No work");
                break;
            default:
                System.out.println("There is no such day");
        }
    }
}
