package ru.mirea.it.java.work12;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Task1 extends JFrame {
    private class Shape extends JPanel {
        private int x;
        private int y;
        private Color color;

        public Shape(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        public int getX() { return this.x; }
        public int getY() { return this.y; }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(this.color);
        }
    }

    private class Rect extends Shape {
        private int w;
        private int h;

        public Rect(int x, int y, int w, int h, Color color) {
            super(x, y, color);
            this.w = w;
            this.h = h;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.fillRect(this.getX(), this.getY(), this.w, this.h);
        }
    }

    private class Circle extends Shape {
        private int r;

        public Circle(int x, int y, int r, Color color) {
            super(x, y, color);
            this.r = r;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int x = this.getX() - (this.r / 2);
            int y = this.getY() - (this.r / 2);
            g.fillOval(x, y, this.r, this.r);
        }
    }

    private Shape[] shapes;

    public Task1() {
        this.shapes = new Shape[20];

        Color[] colors = new Color[]{
            Color.BLACK, Color.BLUE, Color.CYAN, Color.GRAY, Color.GREEN,
            Color.MAGENTA, Color.ORANGE, Color.PINK, Color.YELLOW, Color.RED
        };

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(500) + 50;
            int y = rand.nextInt(300) + 50;
            Color color = colors[rand.nextInt(colors.length)];

            if (rand.nextFloat() < 0.5) {
                // Rect
                int w = rand.nextInt(45) + 5;
                int h = rand.nextInt(45) + 5;
                this.shapes[i] = new Rect(x, y, w, h, color);
            } else {
                // Circle
                int r = rand.nextInt(55) + 10;
                this.shapes[i] = new Circle(x, y, r, color);
            }
        }

        setTitle("Random shapes");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Task1 tester = new Task1();
        tester.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < this.shapes.length; i++) {
            this.shapes[i].paintComponent(g);
        }
    }
}

