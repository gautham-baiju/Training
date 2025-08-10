package Java.Training.Netflix.src;

public class RatingHandler {
    public Rating<Movie> rateMovieOrTVShow(User ratedUser, int rating, Movie ratedItem) {
        Rating<Movie> newRating = new Rating<Movie>(ratedUser, rating, ratedItem);
        ratedUser.addRating(newRating);
        ratedItem.ratings.add(newRating);
        int totalRating = 0;
        for (Rating<Movie> r : ratedItem.ratings) {
            totalRating += r.rating;
        }
        ratedItem.averageRating = (double) totalRating / ratedItem.ratings.size();
        return newRating;
    }

    public Rating<Episode> rateEpisode(User ratedUser, int rating, Episode ratedItem) {
        Rating<Episode> newRating = new Rating<Episode>(ratedUser, rating, ratedItem);
        ratedUser.addRating(newRating);
        ratedItem.ratings.add(newRating);
        int totalRating = 0;
        for (Rating<Episode> r : ratedItem.ratings) {
            totalRating += r.rating;
        }
        ratedItem.averageRating = (double) totalRating / ratedItem.ratings.size();
        return newRating;
    }
}
