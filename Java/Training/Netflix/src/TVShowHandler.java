package Java.Training.Netflix.src;

import java.util.HashSet;

public class TVShowHandler {
    private static HashSet<TVShow> tvShows = new HashSet<>();

    public static TVShow createTVShows(String title, String genre, String releaseYear, String duration) {
        TVShow newTVShow = new TVShow(title, genre, releaseYear, duration);
        tvShows.add(newTVShow);
        return newTVShow;
    }
}
