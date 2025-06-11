package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("red", 2025), new Car("red", 2024), new Car("green", 2012), new Car("blue", 1990), new Car("blue", 1999), new Car("green", 2020), new Car("Green", 1990)));

    public static void main(String[] args) {
        // Filtrando por COR
        List<Car> greenList = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("green");
            }
        });
        List<Car> blueList = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("blue");
            }
        });
        // Filtrando por ANO
        List<Car> yearList = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2020;
            }
        });

        // Filtrando por COR usando LAMBDA
        List<Car> redList = filter(cars, car -> car.getColor().equalsIgnoreCase("red"));

        System.out.println("VERDE: "+greenList);
        System.out.println("AZUL: "+blueList);
        System.out.println("ANO: "+yearList);
        System.out.println("-------");

        System.out.println("VERMELHO: "+redList);
    }



    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
