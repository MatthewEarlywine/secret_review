package org.launchcode.secret_review.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Review extends AbstractEntity{

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
}
