package Java.Training.Netflix.src;

public class Rating<T> implements RatingBase {
    User ratedBy;
    int rating;
    T ratedFor;

    Rating(User ratedBy, int rating, T ratedFor) {
        this.ratedBy = ratedBy;
        this.rating = rating;
        this.ratedFor = ratedFor;
    }
}
