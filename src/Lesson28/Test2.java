package Lesson28;

import java.time.*;

public class Test2 {
    static void duty(LocalDate start, LocalDate finish, Period p) {
        LocalDate date = start;
        while (date.isBefore(finish)) {
            System.out.println("The date has arrived " + date + ". It's time to change the duty officer!");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, 9, 1);
        LocalDate finish = LocalDate.of(2017, 5, 31);
        Period p = Period.ofWeeks(2);
        duty(start, finish, p);
    }
}
