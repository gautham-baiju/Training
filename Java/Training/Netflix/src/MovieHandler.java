package Java.Training.Netflix.src;

import java.util.HashSet;

public class MovieHandler {

    private static HashSet<Movie> movies = new HashSet<>();

    public static Movie createMovie(String title, String genre, String releaseYear, String duration) {
        Movie newMovie = new Movie(title, genre, releaseYear, duration);
        movies.add(newMovie);
        return newMovie;
    }

    public static Movie searchMovie(String title) {
        for (Movie movie : movies) {
            if (movie.title.contains(title)) {
                return movie;
            }
        }
        return null;
    }

    public static HashSet<Movie> getAllMovies() {
        return movies;
    }
}
