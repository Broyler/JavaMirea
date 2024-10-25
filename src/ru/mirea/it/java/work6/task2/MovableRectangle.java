package ru.mirea.it.java.work6.task2;

import ru.mirea.it.java.work6.task1.Movable;
import ru.mirea.it.java.work6.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableRectangle(x1=" + this.topLeft.getX() + ", y1=" + this.topLeft.getY() + ", x2=" +
                this.bottomRight.getX() + ", y2=" + this.bottomRight.getY() +
                ", spdX=" + this.topLeft.getXSpeed() + ", spdY=" + this.topLeft.getYSpeed() + ")";
    }
}
