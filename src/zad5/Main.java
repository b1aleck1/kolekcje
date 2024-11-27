package zad5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, LocalDate.of(2023, 10, 5), 150.00));
        orders.add(new Order(2, LocalDate.of(2023, 9, 15), 200.00));
        orders.add(new Order(3, LocalDate.of(2023, 11, 2), 50.00));
        orders.add(new Order(4, LocalDate.of(2023, 8, 20), 120.00));

        // Sortowanie wg daty
        Collections.sort(orders);
        System.out.println("Zamówienia posortowane wg daty:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Sortowanie wg kwoty (za pomocą komparatora)
        Comparator<Order> amountComparator = new OrderAmountComparator();
        orders.sort(amountComparator);

        System.out.println("\nZamówienia posortowane wg kwoty:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}