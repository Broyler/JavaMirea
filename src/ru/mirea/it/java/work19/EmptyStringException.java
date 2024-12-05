package ru.mirea.it.java.work19;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException() {
        super("Ошибка. Передана пустая строка. Пожалуйста, введите данные о студенте.");
    }
}
