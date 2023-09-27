package Lesson28;

import java.time.*;
import java.time.format.*;

public class Test4 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getYear());
        System.out.println();

        LocalTime lt = LocalTime.of(16, 40, 30, 50000);
        System.out.println(lt.getNano());
        System.out.println(lt.getSecond());
        System.out.println(lt.getMinute());
        System.out.println(lt.getHour());

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ld.format(d1));
        System.out.println(lt.format(d2));
        System.out.println(ldt.format(d3));

        DateTimeFormatter d4 = DateTimeFormatter.ISO_ORDINAL_DATE;
        System.out.println(ld.format(d4));

        DateTimeFormatter shortform = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortform1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter shortform2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ld.format(shortform));
        System.out.println(lt.format(shortform1));
        System.out.println(ldt.format(shortform2));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("d MMMM yyyy год, hh:mm");
        System.out.println(ldt.format(f));

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate l1 = LocalDate.parse("01 02 2015", f1);
        System.out.println(l1);
    }
}
