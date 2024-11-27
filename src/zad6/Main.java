package zad6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car("Toyota", "Corolla", "SB5148Y"));
        cars.add(new Car("Honda", "Civic", "DW2876U"));
        cars.add(new Car("Ford", "Focus", "SB5148Y"));  // Ten sam numer rejestracyjny
        cars.add(new Car("BMW", "X5", "KRA76H5"));
        cars.add(new Car("Tesla", "Model S", "DW2876U"));  // Ten sam numer rejestracyjny

        System.out.println("Samochody w HashSet:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
