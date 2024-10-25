package ru.mirea.it.java.work6.task2;

public class MoveRectTester {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(0, 0, 10, 10, 3, 5);
        System.out.println(rect);
        rect.moveRight();
        rect.moveDown();
        System.out.println(rect);
    }
}
