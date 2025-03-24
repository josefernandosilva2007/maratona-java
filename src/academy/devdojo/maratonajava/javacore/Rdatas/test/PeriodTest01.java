package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        // PARA DATAS
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(21);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(21);
        Period p3 = Period.ofWeeks(8);
        Period p4 = Period.ofMonths(12);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
