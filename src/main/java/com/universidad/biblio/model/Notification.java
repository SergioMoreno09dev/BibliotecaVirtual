package com.universidad.biblio.model;

import java.util.Date;

public class Notification {
    private String message;
    private Date notificationDate;
    private String type;
    private boolean read;
    private User user;

    public Notification() {
    }

    public Notification(String message, Date notificationDate, String type, boolean read, User user) {
        this.message = message;
        this.notificationDate = notificationDate;
        this.type = type;
        this.read = read;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(Date notificationDate) {
        this.notificationDate = notificationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", notificationDate=" + notificationDate +
                ", type='" + type + '\'' +
                ", read=" + read +
                ", user=" + user +
                '}';
    }
}
