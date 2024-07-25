package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor with all parameters
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Overloaded constructor with default number of pages and publication year
    public Book(String title) {
        this.title = title;
        this.numberOfPages = 0;
        this.publicationYear = 0;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // toString method displays all book details
    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + numberOfPages + ", Year: " + publicationYear;
    }
}
