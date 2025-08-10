package Java.Training.Netflix.src;

import java.util.HashSet;

public class User {
    private String username;
    private String password;
    private HashSet<RatingBase> ratings = new HashSet<>();
    private HashSet<Movie> watchlist = new HashSet<>();

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void addToWatchlist(Movie item) {
        this.watchlist.add(item);
    }

    public void addRating(RatingBase rating) {
        ratings.add(rating);
    }
}
