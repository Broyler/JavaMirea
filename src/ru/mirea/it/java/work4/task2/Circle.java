package ru.mirea.it.java.work4.task2;

import ru.mirea.it.java.work4.task2.Shape;

public class Circle extends Shape {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        super("Circle");
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public String toString() {
        return "Circle at " + this.x + " " + this.y + 
            " with radius=" + this.r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }
}
