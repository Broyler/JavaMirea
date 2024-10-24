package ru.mirea.it.java.work7;

public class MoveRectTester {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(10, 5, 4, 4, 2, -3);
        System.out.println(rect);
        rect.moveUp();
        rect.moveRight();
        System.out.println(rect);
    }
}
