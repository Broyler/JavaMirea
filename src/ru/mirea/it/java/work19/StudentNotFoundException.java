package ru.mirea.it.java.work19;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException() {
        super("Ошибка. Студент не найден");
    }
}
