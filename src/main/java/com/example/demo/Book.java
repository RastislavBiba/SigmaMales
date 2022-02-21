package com.example.demo;

public class Book {
    private long id;
    private String name;
    private String isbn;
    private String authorFirstName;
    private String authorSecondName;
    private int bookCounter;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    public int getBookCounter() {
        return bookCounter;
    }

    public void setBookCounter(int bookCounter) {
        this.bookCounter = bookCounter;
    }

    private String Author;
    private String Title;

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
