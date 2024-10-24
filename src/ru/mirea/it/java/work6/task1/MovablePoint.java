package ru.mirea.it.java.work6.task1;

import ru.mirea.it.java.work6.task1.Movable;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        this.y += this.ySpeed;
    }

    public void moveDown() {
        this.y -= this.ySpeed;
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    public void moveRight() {
        this.x += this.xSpeed;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getXSpeed() {
        return this.xSpeed;
    }

    public int getYSpeed() {
        return this.ySpeed;
    }

    public String toString() {
        return "MovablePoint: (" + this.x + ", " + this.y + "), spd: (" +
            this.xSpeed + ", " + this.ySpeed + ")";
    }

    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(4, 2, 1, 1);
        p.moveRight();
        p.moveRight();
        System.out.println(p);
    }
}
