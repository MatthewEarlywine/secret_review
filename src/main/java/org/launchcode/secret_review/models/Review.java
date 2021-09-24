package org.launchcode.secret_review.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private int review_id;

    @NotBlank
    @NotNull
    private String restaurantName;

    @NotBlank
    @NotNull
    private String rating;

    public Review(String restaurantName, String rating) {
        this.restaurantName = restaurantName;
        this.rating = rating;
    }

    public Review() {
    }

    public int getReview_id() {
        return review_id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "restaurant_name='" + restaurantName + '\'' +
                ", rating='" + rating + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return review_id == review.review_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(review_id);
    }
}
