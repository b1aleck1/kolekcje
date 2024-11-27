package zad4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji obiektów User
        User user1 = new User("john_doe", "john@example.com", 1);
        User user2 = new User("jane_smith", "jane@example.com", 2);
        User user3 = new User("john_doe", "john_doe@example.com", 1); // Ten sam numer ID co user1
        User user4 = new User("bob_brown", "bob@example.com", 3);

        HashSet<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3); // Ten użytkownik ma ten sam numer ID co user1, więc nie zostanie dodany
        userSet.add(user4);

        System.out.println("Zawartość HashSet:");
        for (User user : userSet) {
            System.out.println(user);
        }
        System.out.println("\nCzy user1 i user3 są równi? " + user1.equals(user3));
        System.out.println("Czy user1 i user2 są równi? " + user1.equals(user2));
    }
}
