package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2026, Month.JANUARY, 05);
        LocalDate now = LocalDate.now();
        System.out.println(date.getChronology());
        System.out.println(date.getEra());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date);
        System.out.println(now);
    }
}
