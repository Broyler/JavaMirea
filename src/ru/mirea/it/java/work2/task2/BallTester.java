package ru.mirea.it.java.work2.task2;

import java.util.Scanner;

public class BallTester {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        System.out.println(b1);
        b1.setX(2.3);
        b1.setY(-3.4);
        System.out.println(b1);

        Ball b2 = new Ball(5, 12.5);
        System.out.println(b2);
        b2.setXY(0.5, 2.78);
        System.out.println(b2);

        Scanner scanner = new Scanner(System.in);
        double dx = scanner.nextDouble();
        double dy = scanner.nextDouble();

        b2.move(dx, dy);
        System.out.println(b2);
    }
}
