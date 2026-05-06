package com.universidad.biblio.model;

import java.util.Date;
import java.util.Objects;

public class Publisher {
    private String name;
    private String country;
    private Date foundingYear;

    public Publisher() {
    }

    public Publisher(String name, String country, Date foundingYear) {
        this.name = name;
        this.country = country;
        this.foundingYear = foundingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(Date foundingYear) {
        this.foundingYear = foundingYear;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", foundingYear=" + foundingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Publisher publisher)) return false;
        return Objects.equals(name, publisher.name) && Objects.equals(country, publisher.country) && Objects.equals(foundingYear, publisher.foundingYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, foundingYear);
    }
}
