package com.libraryapi.model;

import java.sql.Timestamp;

public class Book {
    private int id;
    private String title;
    private String subtitle;
    private String book_cover;
    private Timestamp release_date;

    public Book(int id, String title, String subtitle, String book_cover, Timestamp release_date) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.book_cover = book_cover;
        this.release_date = release_date;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getBook_cover() {
        return book_cover;
    }

    public void setBook_cover(String book_cover) {
        this.book_cover = book_cover;
    }

    public Timestamp getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Timestamp release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", book_cover='" + book_cover + '\'' +
                ", release_date=" + release_date +
                '}';
    }
}
