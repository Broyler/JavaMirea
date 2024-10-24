package ru.mirea.it.java.work7;

public class MovableRectangle implements Movable {
    private MovablePoint a = null;
    private MovablePoint b = null;
    private final int w;
    private final int h;

    public MovableRectangle(int x, int y, int w, int h, int speedX, int speedY) {
        this.a = new MovablePoint(x, y, speedX, speedY);
        this.b = new MovablePoint(x+w, y+h, speedX, speedY);
        this.w = w;
        this.h = h;
    }

    public void moveUp() {
        this.a.moveUp();
        this.b.moveUp();
    }

    public void moveDown() {
        this.a.moveDown();
        this.b.moveDown();
    }

    public void moveLeft() {
        this.a.moveLeft();
        this.b.moveLeft();
    }

    public void moveRight() {
        this.a.moveRight();
        this.b.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle(x=" + this.a.getX() + ", y=" + this.a.getY() + ", w=" + this.w + ", h=" + h +
                ", spdX=" + this.a.getXSpeed() + ", spdY=" + this.a.getYSpeed() + ")";
    }
}
