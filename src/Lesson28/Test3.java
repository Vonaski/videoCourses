package Lesson28;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, 9, 1);
        LocalTime lt = LocalTime.of(10, 30);
        Period p = Period.ofMonths(3);
        Period p1 = p.plusDays(10);
        System.out.println(start.plus(p1));

        Duration d = Duration.ofHours(3);
        System.out.println(lt.plus(d));
    }

}
