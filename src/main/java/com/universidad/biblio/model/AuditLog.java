package com.universidad.biblio.model;

import java.util.Date;

public class AuditLog {
    private String action;
    private Date actionDate;
    private String description;
    private User user;

    public AuditLog() {
    }

    public AuditLog(String action, Date actionDate, String description, User user) {
        this.action = action;
        this.actionDate = actionDate;
        this.description = description;
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "AuditLog{" +
                "action='" + action + '\'' +
                ", actionDate=" + actionDate +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
