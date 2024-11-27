package zad6;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String licensePlate;

    public Car(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Porównanie referencji
        if (obj == null || getClass() != obj.getClass()) return false;  // Sprawdzenie typu
        Car car = (Car) obj;
        return Objects.equals(licensePlate, car.licensePlate);  // Porównanie po numerze rejestracyjnym
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);  // Hash tylko na podstawie numeru rejestracyjnego
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", licensePlate='" + licensePlate + '\'' + '}';
    }
}
