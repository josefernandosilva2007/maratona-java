package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(
                new Car("red", 2025),
                new Car("red", 2024),
                new Car("green", 2012),
                new Car("blue", 1990),
                new Car("blue", 1999),
                new Car("green", 2020),
                new Car("Green", 1990)
        ));

        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println("--------------");

        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "blue"));
        System.out.println("--------------");

        System.out.println(filterCarByYear(cars, 2010));

    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("red")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(color)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByYear(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }


}
