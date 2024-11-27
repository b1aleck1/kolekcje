package zad3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static Map<String, String> hashMapDictionary = new HashMap<>();
    private static Map<String, String> treeMapDictionary = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj słowo i definicję");
            System.out.println("2. Wyświetl wszystkie słowa (HashMap - dowolna kolejność)");
            System.out.println("3. Wyświetl wszystkie słowa (TreeMap - alfabetyczna kolejność)");
            System.out.println("4. Wyjście");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumowanie nowej linii po numerze

            switch (choice) {
                case 1 -> addWord(scanner);
                case 2 -> displayWords(hashMapDictionary, "HashMap");
                case 3 -> displayWords(treeMapDictionary, "TreeMap");
                case 4 -> running = false;
                default -> System.out.println("Niepoprawny wybór, spróbuj ponownie.");
            }
        }

        scanner.close();
    }

    private static void addWord(Scanner scanner) {
        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();
        System.out.print("Podaj definicję: ");
        String definition = scanner.nextLine();

        hashMapDictionary.put(word, definition);
        treeMapDictionary.put(word, definition);

        System.out.println("Dodano słowo i definicję do słownika.");
    }

    private static void displayWords(Map<String, String> dictionary, String mapType) {
        System.out.println("\nSłownik (" + mapType + "):");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println("Słowo: " + entry.getKey() + ", Definicja: " + entry.getValue());
        }

        // inne sposoby wyświetlania map:
        // for (String key : dictionary.keySet()) {
        //    System.out.println("Słowo: " + key + ", Definicja: " + dictionary.get(key)); }
        //
        //dictionary.forEach((key, value) ->
        //    System.out.println("Słowo: " + key + ", Definicja: " + value));

    }
}
