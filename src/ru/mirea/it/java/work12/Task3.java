package ru.mirea.it.java.work12;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

import java.util.Timer;
import java.util.TimerTask;

public class Task3 extends JFrame {
    private BufferedImage[] images;
    private int imageIndex = 0;
    private int ticks = 0;
    private int ticksRequired = 20;
    private boolean reverseOrder = false;
    private Timer timer;

    private BufferedImage getImg(String path) {
        try {
            File file = new File(path);
            return ImageIO.read(file);
        } catch (IOException e) {
            System.out.println("getImg IOException.");
            System.exit(1);
        }
        return null;
    }

    public Task3() {
        this.images = new BufferedImage[4];
        images[0] = getImg("ru/mirea/it/java/work12/frame1.png");
        images[1] = getImg("ru/mirea/it/java/work12/frame2.png");
        images[2] = getImg("ru/mirea/it/java/work12/frame3.png");
        images[3] = getImg("ru/mirea/it/java/work12/frame4.png");

        timer = new Timer();
        timer.scheduleAtFixedRate(new Animate(), 100, 10);

        setTitle("Simple animation");
        setSize(this.images[0].getWidth(), this.images[0].getHeight());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ticks++;
        if (ticks > ticksRequired) {
            if (!reverseOrder) {
                imageIndex++;
            } else {
                imageIndex--;
            }
            ticks = 0;
        }
        if (imageIndex >= 4) {
            imageIndex = 2;
            reverseOrder = true;
        } else if (imageIndex < 0) {
            imageIndex = 1;
            reverseOrder = false;
        }

        g.drawImage(images[imageIndex], 0, 0, this);
    }

    class Animate extends TimerTask {
        public void run() {
            repaint();      
        }
    }

    public static void main(String[] args) {
        Task3 window = new Task3();
        window.setVisible(true);
    }
}
