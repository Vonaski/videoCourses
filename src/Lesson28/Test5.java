package Lesson28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test5 {
    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
    void shift(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Work from: " + ldt1.format(f1));
            ldt1 = ldt1.plus(p);
            System.out.println("To: " + ldt1.format(f1));
            System.out.println("Rest from: " + ldt1.format(f2));
            ldt1.plus(d);
            System.out.println("To: " + ldt1.format(f2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 2, 3, 9, 0);
        Period p = Period.ofWeeks(2);
        Duration d = Duration.ofDays(3);
        Test5 t = new Test5();
        t.shift(ldt1, ldt2, p, d);
    }
}
