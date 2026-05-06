package com.universidad.biblio.model;

import java.util.Date;
import java.util.Objects;

public class Loan {
    private User user;
    private Book book;
    private Date loanDate;
    private Date returnDate;

    public Loan() {
    }

    public Loan(User user, Book book, Date loanDate, Date returnDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
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

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "user=" + user +
                ", book=" + book +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Loan loan)) return false;
        return Objects.equals(user, loan.user) && Objects.equals(book, loan.book) && Objects.equals(loanDate, loan.loanDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, book, loanDate);
    }
}
