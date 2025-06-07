package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.AircraftSingletonEnum;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat) {
        AircraftSingletonEnum instace = AircraftSingletonEnum.INSTACE;

        System.out.println(instace.bookSeat(seat));

    }
}
