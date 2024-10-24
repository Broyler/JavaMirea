package ru.mirea.it.java.work6.task1;

import ru.mirea.it.java.work6.task1.Movable;
import ru.mirea.it.java.work6.task1.MovablePoint;

public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp() {
        this.center.moveUp();
    }

    public void moveDown() {
        this.center.moveDown();
    }

    public void moveRight() {
        this.center.moveRight();
    }

    public void moveLeft() {
        this.center.moveLeft();
    }
    
    public String toString() {
        return "MovableCircle: at (" + this.center.getX() + ", " + 
            this.center.getY() +"), R=" + this.radius + ", spd=(" +
            this.center.getXSpeed() + ", " + this.center.getYSpeed() + ")";
    }

    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 3);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}
