package ru.mirea.it.java.work4.task2;

import ru.mirea.it.java.work4.task2.Rect;

public class Square extends Rect {
    private double side;

    public Square(double x, double y, double side) {
        super(x, y, side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Rect at x=" + this.getX() + ", y=" + this.getY() + 
            ", with sides=" + this.side;
    }
}
