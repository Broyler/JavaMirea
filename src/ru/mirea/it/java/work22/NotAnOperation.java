package ru.mirea.it.java.work22;

public class NotAnOperation extends RuntimeException {
    public NotAnOperation() {
        super("Выбрана не существующая операция.");
    }
}
