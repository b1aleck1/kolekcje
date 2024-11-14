package zad1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> ts = new TreeSet<>();

        System.out.println("Podaj słowa oddzielone spacjami: ");
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            hs.add(s);
            ts.add(s);
        }

        System.out.println("HashSet - kolejność dowolna: "+hs);
        System.out.println("TreeSet - kolejność alfabetyczna: "+ts);
    }
}
