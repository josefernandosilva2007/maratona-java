package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTACE = new AircraftSingletonEager();
    private final Set<String> availablesSeats = new HashSet<>();
    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availablesSeats.remove(seat);
    }

    public static AircraftSingletonEager getInstance() {
        return INSTACE;
    }


}
