package Java.Training.Netflix.src;

import java.util.HashSet;

public class Movie {
    String title;
    String genre;
    String releaseYear;
    String duration;
    HashSet<Rating<Movie>> ratings = new HashSet<>();
    Double averageRating = 0.0;

    Movie(String title, String genre, String releaseYear, String duration) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }
}
