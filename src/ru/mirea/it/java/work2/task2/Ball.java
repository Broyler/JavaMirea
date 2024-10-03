package ru.mirea.it.java.work2.task2;

public class Ball {
    private double x = 0;
    private double y = 0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {}

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    @Override
    public String toString() {
        return "Ball: x=" + this.x + ", y=" + this.y;
    }


}
