package academy.devdojo.maratonajava.javacore.Rdatas.test;



import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        // PARA HORAS
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime time = LocalTime.now();
        LocalTime timeMinus5Hours = LocalTime.now().minusHours(5);
        System.out.println(Duration.between(now,nowAfterTwoYears));

    }
}
