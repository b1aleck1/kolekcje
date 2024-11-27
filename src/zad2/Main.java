package zad2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int numberOfElements = 100000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random rand = new Random();

        testAdding(arrayList, rand, numberOfElements);
        testAdding(linkedList, rand, numberOfElements);

        testRemoving(arrayList, numberOfElements);
        testRemoving(linkedList, numberOfElements);

        testSearching(arrayList, rand);
        testSearching(linkedList, rand);
    }

    public static void testAdding(List<Integer> list, Random rand, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(rand.nextInt(1000)); // Losowa liczba z zakresu 0-999
        }
        long endTime = System.nanoTime();
        System.out.println("Czas dodawania do " + list.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    public static void testRemoving(List<Integer> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.remove(list.size() - 1); // Usuwamy ostatni element
        }
        long endTime = System.nanoTime();
        System.out.println("Czas usuwania z " + list.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    public static void testSearching(List<Integer> list, Random rand) {
        long startTime = System.nanoTime();
        list.contains(rand.nextInt(1000)); // Sprawdzamy, czy lista zawiera losowy element
        long endTime = System.nanoTime();
        System.out.println("Czas przeszukiwania w " + list.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }
}
