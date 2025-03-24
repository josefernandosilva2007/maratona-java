package academy.devdojo.maratonajava.javacore.Rdatas.test;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniver = LocalDateTime.of(2007, Month.JANUARY, 5, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniver, now));
        System.out.println(ChronoUnit.WEEKS.between(aniver, now));
        System.out.println(ChronoUnit.MONTHS.between(aniver, now));
        System.out.println(ChronoUnit.YEARS.between(aniver, now));
    }
}
