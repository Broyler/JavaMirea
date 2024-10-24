package ru.mirea.it.java.work4.task2;

import ru.mirea.it.java.work4.task2.Shape;

public class Rect extends Shape {
    private double x;
    private double y;
    private double w;
    private double h;

    public Rect(double x, double y, double w, double h) {
        super("Rectangle");
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public double getArea() {
        return this.w * this.h;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.w + 2 * this.h;
    }

    @Override
    public String toString() {
        return "Rectangle at x=" + this.x + ", y=" + this.y +
            ", with width=" + this.w + ", height=" + this.h;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}
