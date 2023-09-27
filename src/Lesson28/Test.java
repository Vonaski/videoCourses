package Lesson28;

import java.time.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        LocalDate ld1 = LocalDate.of(2014, 5, 15); // methods: plusDays, minusDays, plusWeeks, minusWeeks, plusMonths, minusMonths, plusYears, minusYears
        ld1 = ld1.minusWeeks(2);
        ld1 = ld1.plusDays(3);
        ld1 = ld1.plusMonths(4);
        ld1 = ld1.minusYears(3);
        System.out.println(ld1);

        LocalTime lt1 = LocalTime.of(15, 30, 45, 999999999); // methods: plusHours, minusHours, plusMinutes, minusMinutes, plusSeconds, minusSecond, plusNanos, minusNanos
        lt1 = lt1.plusHours(1).minusMinutes(15).minusSeconds(30).plusNanos(123456789);
        System.out.println(lt1);

        LocalDateTime ldt1 = LocalDateTime.of(2015, Month.SEPTEMBER, 10, 17, 25);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2015, 9, 10, 17, 25, 18);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt3);
    }
}