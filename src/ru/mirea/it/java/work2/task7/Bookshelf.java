package ru.mirea.it.java.work2.task7;

import ru.mirea.it.java.work2.task7.Book;

import java.util.ArrayList;
import java.util.List;


public class Bookshelf {
    private Book[] books;
    private final int count;

    public Bookshelf(int count) {
       this.count = count;
       this.books = new Book[count];
    }

    public void AddBook(Book book) {
        for (int i = 0; i < this.count; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                return;
            }
        }
        System.out.println("Нет места для новых книг!");
    }

    public Book getOldest() {
        Book oldest = null;
        for (Book book : this.books) {
            if (oldest == null || book.getYear() < oldest.getYear()) {
                oldest = book;
            }
        }
        return oldest;
    }

    public Book getNewest() {
        Book newest = null;
        for (Book book : this.books) {
            if (newest == null || book.getYear() > newest.getYear()) {
                newest = book;
            }
        }
        return newest;
    }

    public void sortBooks() {
        for (int i = 0; i < this.count; i++) {
            for (int j = i + 1; j < this.count; j++) {
                if (this.books[j].getYear() < this.books[i].getYear()) {
                    Book temp = this.books[i];
                    this.books[i] = this.books[j];
                    this.books[j] = temp;
                }
            }
        }
    }

    public void listBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
}
