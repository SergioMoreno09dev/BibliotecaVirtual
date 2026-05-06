package com.universidad.biblio.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private List<Author> author;
    private List<Category> category;
    private int stock;
    private String language;
    private Date year;
    private String type;
    private String cantPage;
    private Publisher publisher;

    public Book() {
    }

    public Book(String isbn, String title, List<Author> author, List<Category> category, int stock, String language, Date year, String type, String cantPage, Publisher publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
        this.language = language;
        this.year = year;
        this.type = type;
        this.cantPage = cantPage;
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCantPage() {
        return cantPage;
    }

    public void setCantPage(String cantPage) {
        this.cantPage = cantPage;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", category=" + category +
                ", stock=" + stock +
                ", language='" + language + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", cantPage='" + cantPage + '\'' +
                ", publisher=" + publisher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
