package zad1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    private static HashSet<String> hs = new HashSet<>();
    private static TreeSet<String> ts = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj słowa oddzielone spacjami: ");
        String[] input = sc.nextLine().split(" ");

        measureAdditionTime(input);

        displaySets();

        measureRemovalTime(input);
    }

    private static void measureAdditionTime(String[] input) {
        long startTime, endTime;

        startTime = System.nanoTime();
        for (String s : input) {
            hs.add(s);
        }
        endTime = System.nanoTime();
        System.out.println("Czas dodawania do HashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (String s : input) {
            ts.add(s);
        }
        endTime = System.nanoTime();
        System.out.println("Czas dodawania do TreeSet: " + (endTime - startTime) + " ns");
    }


    private static void measureRemovalTime(String[] input) {
        long startTime, endTime;


        startTime = System.nanoTime();
        for (String s : input) {
            hs.remove(s);
        }
        endTime = System.nanoTime();
        System.out.println("Czas usuwania z HashSet: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        for (String s : input) {
            ts.remove(s);
        }
        endTime = System.nanoTime();
        System.out.println("Czas usuwania z TreeSet: " + (endTime - startTime) + " ns");
    }

    private static void displaySets() {
        System.out.println("HashSet - kolejność dowolna: " + hs);
        System.out.println("TreeSet - kolejność alfabetyczna: " + ts);
    }
}

