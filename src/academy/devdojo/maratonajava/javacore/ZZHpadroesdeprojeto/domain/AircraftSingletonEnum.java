package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTACE;
    private final Set<String> availablesSeats;

    AircraftSingletonEnum() {
        this.availablesSeats = new HashSet<>();
        this.availablesSeats.add("1A");
        this.availablesSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availablesSeats.remove(seat);
    }
}
