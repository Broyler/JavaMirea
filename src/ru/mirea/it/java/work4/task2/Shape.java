package ru.mirea.it.java.work4.task2;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea();
    abstract double getPerimeter();
}
