package zad4;

import java.util.Objects;

public class User {
    private String username;
    private String email;
    private int userId;

    public User(String username, String email, int userId) {
        this.username = username;
        this.email = email;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getUserId() {
        return userId;
    }

    // Nadpisanie metody equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Sprawdzenie referencji
        if (obj == null || getClass() != obj.getClass()) return false; // Sprawdzenie typu
        User user = (User) obj; // Rzutowanie obiektu na klasę User
        return userId == user.userId; // Porównanie numeru ID
    }

    // Nadpisanie metody hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(userId); // Generowanie hashCode na podstawie numeru ID
    }

    // ToString dla łatwego wyświetlania obiektu
    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "', userId=" + userId + '}';
    }
}
