package com.universidad.biblio.model;

import java.util.Objects;

public class Report {
    private String title;
    private String type;
    private String content;

    public Report() {
    }

    public Report(String title, String type, String content) {
        this.title = title;
        this.type = type;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Report report)) return false;
        return Objects.equals(title, report.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
