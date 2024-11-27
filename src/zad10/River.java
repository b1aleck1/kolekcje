package zad10;
//
import java.util.*;

public class River {
        private String namePolish;   // Nazwa w języku polskim
        private String nameGerman;   // Nazwa w języku niemieckim
        private String nameCzech;    // Nazwa w języku czeskim
        private String flowsInto;    // Nazwa rzeki, do której wpływa
        private List<Point> course;  // Przebieg rzeki (lista punktów)

        // Konstruktor
        public River(String namePolish, String nameGerman, String nameCzech, String flowsInto, List<Point> course) {
            this.namePolish = namePolish;
            this.nameGerman = nameGerman;
            this.nameCzech = nameCzech;
            this.flowsInto = flowsInto;
            this.course = course;
        }

        // Gettery
        public String getNamePolish() {
            return namePolish;
        }

        public String getNameGerman() {
            return nameGerman;
        }

        public String getNameCzech() {
            return nameCzech;
        }

        public String getFlowsInto() {
            return flowsInto;
        }

        public List<Point> getCourse() {
            return course;
        }

        // Wyświetlanie w zależności od języka
        public String getNameByLanguage(String language) {
            switch (language.toLowerCase()) {
                case "polish": return namePolish;
                case "german": return nameGerman;
                case "czech": return nameCzech;
                default: throw new IllegalArgumentException("Unsupported language: " + language);
            }
        }

        @Override
        public String toString() {
            return "River{" +
                    "namePolish='" + namePolish + '\'' +
                    ", nameGerman='" + nameGerman + '\'' +
                    ", nameCzech='" + nameCzech + '\'' +
                    ", flowsInto='" + flowsInto + '\'' +
                    ", course=" + course +
                    '}';
        }
    }

    // Klasa reprezentująca punkt geograficzny
    class Point {
        double latitude;
        double longitude;

        public Point(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        @Override
        public String toString() {
            return "(" + latitude + ", " + longitude + ")";
        }
}

