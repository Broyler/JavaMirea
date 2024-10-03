package ru.mirea.it.java.work2.task7;

public class Book {
    private final String author;
    private String name;
    private final int year;
    private int pages;

    public Book(String author, String name, int year, int pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int getPages() {
        return this.pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void addPage() {
        this.pages++;
    }

    @Override
    public String toString() {
        return "Book: name=" + this.name +
                ", author=" + this.author +
                ", year=" + this.year +
                ", pages=" + this.pages;
    }
}
