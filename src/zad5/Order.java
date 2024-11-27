package zad5;

import java.time.LocalDate;
import java.util.Objects;

public class Order implements Comparable<Order> {
    private int orderNumber;
    private LocalDate orderDate;
    private double amount;

    // Konstruktor
    public Order(int orderNumber, LocalDate orderDate, double amount) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.amount = amount;
    }

    // Gettery
    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getAmount() {
        return amount;
    }

    // Implementacja metody compareTo() do sortowania według daty
    @Override
    public int compareTo(Order other) {
        return this.orderDate.compareTo(other.orderDate);
    }

    // Nadpisanie metody toString() do czytelnego wyświetlania
    @Override
    public String toString() {
        return "Order{orderNumber=" + orderNumber + ", orderDate=" + orderDate + ", amount=" + amount + '}';
    }

    // Nadpisanie equals() i hashCode() dla porównywania obiektów
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        return orderNumber == order.orderNumber &&
                Double.compare(order.amount, amount) == 0 &&
                Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, orderDate, amount);
    }
}
