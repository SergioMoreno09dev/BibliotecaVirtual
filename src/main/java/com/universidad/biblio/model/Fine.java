package com.universidad.biblio.model;

import java.util.Date;
import java.util.Objects;

public class Fine {
    private double amount;
    private Date generateDate;
    private String status;
    private Loan loan;
    private User user;

    public Fine() {
    }

    public Fine(double amount, Date generateDate, String status, Loan loan, User user) {
        this.amount = amount;
        this.generateDate = generateDate;
        this.status = status;
        this.loan = loan;
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "amount=" + amount +
                ", generateDate=" + generateDate +
                ", status='" + status + '\'' +
                ", loan=" + loan +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fine fine)) return false;
        return Objects.equals(generateDate, fine.generateDate) && Objects.equals(loan, fine.loan) && Objects.equals(user, fine.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generateDate, loan, user);
    }
}
