package ru.mirea.it.java.work2.task7;

import ru.mirea.it.java.work2.task7.Book;
import ru.mirea.it.java.work2.task7.Bookshelf;

public class BookshelfTester {
    public static void main(String[] args) {
        Book b1 = new Book("А", "Аб", 1950, 207);
        Book b2 = new Book("Б", "Бва", 1877, 210);
        Book b3 = new Book("А", "Адв", 1901, 510);
        Book b4 = new Book("В", "Вдбвал", 1899, 340);
        Book b5 = new Book("Г", "Гыы", 1966, 109);

        Bookshelf shelf = new Bookshelf(5);
        shelf.AddBook(b1);
        shelf.AddBook(b2);
        shelf.AddBook(b3);
        shelf.AddBook(b4);
        shelf.AddBook(b5);

        shelf.AddBook(b5);

        System.out.println("Самая старая " + shelf.getOldest());
        System.out.println("Самая новая " + shelf.getNewest());

        System.out.println("\nВсе книги:");
        shelf.listBooks();
        shelf.sortBooks();
        System.out.println("\nОтсортированные:");
        shelf.listBooks();
    }
}
