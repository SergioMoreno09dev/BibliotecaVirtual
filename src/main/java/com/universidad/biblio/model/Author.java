package com.universidad.biblio.model;

import java.util.Objects;

public class Author {
    private String name;
    private String nation;

    public Author() {
    }

    public Author(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Author author)) return false;
        return Objects.equals(name, author.name) && Objects.equals(nation, author.nation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nation);
    }
}
