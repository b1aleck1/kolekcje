package zad10;

import java.util.*;

public class RiverManager {

    private Map<String, River> riversPolish = new TreeMap<>();
    private Map<String, River> riversGerman = new TreeMap<>();
    private Map<String, River> riversCzech = new TreeMap<>();

    // Dodawanie rzeki
    public void addRiver(River river) {
        riversPolish.put(river.getNamePolish(), river);
        riversGerman.put(river.getNameGerman(), river);
        riversCzech.put(river.getNameCzech(), river);
    }

    // Wyświetlanie rzek w zadanym języku
    public void displayRivers(String language) {
        Map<String, River> selectedMap;
        switch (language.toLowerCase()) {
            case "polish": selectedMap = riversPolish; break;
            case "german": selectedMap = riversGerman; break;
            case "czech": selectedMap = riversCzech; break;
            default: throw new IllegalArgumentException("Unsupported language: " + language);
        }

        for (Map.Entry<String, River> entry : selectedMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    // Filtracja rzek (dorzecze)
    public void displayBasin(String riverName) {
        System.out.println("Rivers flowing into: " + riverName);
        for (River river : riversPolish.values()) {
            if (river.getFlowsInto().equalsIgnoreCase(riverName)) {
                System.out.println(river);
            }
        }
    }
}
