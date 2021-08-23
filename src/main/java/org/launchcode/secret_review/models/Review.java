package org.launchcode.secret_review.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Review extends AbstractEntity{

    @NotBlank
    @NotNull
    private String ticket;

    @NotBlank
    @NotNull
    private String review;

    public Review(String ticket, String review) {
        this.ticket = ticket;
        this.review = review;
    }

    public Review() {
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
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
                "ticket='" + ticket + '\'' +
                ", review='" + review + '\'';
    }
}
