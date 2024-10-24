package ru.mirea.it.java.work4.task2;

import ru.mirea.it.java.work4.task2.Circle;
import ru.mirea.it.java.work4.task2.Rect;
import ru.mirea.it.java.work4.task2.Square;

public class Abstract {
    public static void main(String[] args) {
        Circle circ = new Circle(3.2, 0.2, 10);
        System.out.println(circ);
        System.out.println(circ.getPerimeter());
        System.out.println(circ.getArea());

        Rect rect = new Rect(0.5, -0.5, 10, 4);
        System.out.println(rect);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());

        Square sq = new Square(0, 0, 20);
        System.out.println(sq);
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
    }
}
