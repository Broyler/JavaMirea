package ru.mirea.it.java.work5;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class task2 extends JFrame {
    private BufferedImage image;

    public task2(String imagePath) {
        try {
            File imgFile = new File(imagePath);
            image = ImageIO.read(imgFile);
        } catch (IOException e) {
            System.out.println("Ошибка, не найдена картинка по пути: " + imagePath);
            System.exit(1);
        }

        setTitle("Image Viewer");
        setSize(image.getWidth(), image.getHeight());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Путь к картинке не указан в аргументах командной строки.");
            System.exit(1);
        }

        task2 window = new task2(args[0]);
        window.setVisible(true);
    }
}
