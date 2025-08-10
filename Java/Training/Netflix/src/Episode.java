package Java.Training.Netflix.src;

import java.util.HashSet;

public class Episode {
    String title;
    int episodeNumber;
    String duration;
    HashSet<Rating<Episode>> ratings = new HashSet<>();
    Double averageRating = 0.0;

    Episode(String title, int episodeNumber, String duration) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.duration = duration;
    }
}
