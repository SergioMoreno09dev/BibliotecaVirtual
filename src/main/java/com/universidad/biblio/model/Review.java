package com.universidad.biblio.model;

import java.util.Date;
import java.util.Objects;

public class Review {
    private int rating;
    private String comment;
    private Date reviewDate;
    private User user;
    private Book book;

    public Review() {
    }

    public Review(int rating, String comment, Date reviewDate, User user, Book book) {
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
        this.user = user;
        this.book = book;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", comment='" + comment + '\'' +
                ", reviewDate=" + reviewDate +
                ", user=" + user +
                ", book=" + book +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Review review)) return false;
        return Objects.equals(reviewDate, review.reviewDate) && Objects.equals(user, review.user) && Objects.equals(book, review.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewDate, user, book);
    }
}
