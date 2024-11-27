package zad10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RiverManager manager = new RiverManager();

        // Tworzenie przykładowych rzek
        River vistula = new River("Wisła", "Weichsel", "Vltava",
                "Bałtyk",
                Arrays.asList(new Point(50.0, 19.0), new Point(54.0, 18.0)));

        River oder = new River("Odra", "Oder", "Odra",
                "Bałtyk",
                Arrays.asList(new Point(49.0, 18.0), new Point(53.0, 14.0)));

        River elbe = new River("Łaba", "Elbe", "Labe",
                "Morze Północne",
                Arrays.asList(new Point(50.0, 13.0), new Point(54.0, 8.0)));

        // Dodanie rzek do zarządcy
        manager.addRiver(vistula);
        manager.addRiver(oder);
        manager.addRiver(elbe);

        // Wyświetlanie rzek w różnych językach
        System.out.println("Rzeki po polsku:");
        manager.displayRivers("polish");

        System.out.println("\nRzeki po niemiecku:");
        manager.displayRivers("german");

        System.out.println("\nRzeki po czesku:");
        manager.displayRivers("czech");

        // Wyświetlanie dorzecza
        System.out.println("\nDorzecze Wisły:");
        manager.displayBasin("Bałtyk");
    }
}
