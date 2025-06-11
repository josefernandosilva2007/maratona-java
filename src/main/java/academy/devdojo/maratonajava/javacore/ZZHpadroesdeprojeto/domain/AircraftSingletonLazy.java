package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTACE;
    private final Set<String> availablesSeats = new HashSet<>();
    {
        availablesSeats.add("1A");
        availablesSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availablesSeats.remove(seat);
    }

    public static AircraftSingletonLazy getInstance() {
        if(INSTACE == null){
            synchronized (AircraftSingletonLazy.class){
                if(INSTACE == null) {
                    INSTACE = new AircraftSingletonLazy();
                }
            }
        }
        return INSTACE;
    }


}
