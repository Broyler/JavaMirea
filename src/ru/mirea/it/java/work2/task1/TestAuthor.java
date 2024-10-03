package ru.mirea.it.java.work2.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author testAuthor = new Author(
                "Иван Трамплин",
                "trampoline123@yahoo.com",
                'M'
        );
        System.out.println("Почта: " + testAuthor.getEmail());
        Scanner scanner = new Scanner(System.in);
        String newMail = scanner.next();
        testAuthor.setEmail(newMail);
        System.out.println(testAuthor);
    }
}
