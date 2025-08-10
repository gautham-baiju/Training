package Java.Training.Netflix.src;

import java.util.HashSet;

public class Auth {
    private static HashSet<String> usernames = new HashSet<>();

    public static User createAccount(String username, String password) {
        if (!usernames.contains(username)) {
            usernames.add(username);
            return new User(username, password);
        }
        return null;
    }
}
