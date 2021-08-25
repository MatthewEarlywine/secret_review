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
    private String review;

    public Review(String restaurantName, String review) {
        this.restaurantName = restaurantName;
        this.review = review;
    }

    public Review() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Review{" +
                "restaurant_name='" + restaurantName + '\'' +
                ", review='" + review + '\'';
    }
}
