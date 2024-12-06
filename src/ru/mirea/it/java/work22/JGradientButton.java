package ru.mirea.it.java.work22;

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JGradientButton extends JButton implements MouseListener {
    private final Color[] colors;
    private final float[] positions;
    private boolean isPressed = false;

    public JGradientButton(String label, Color[] colors, float[] positions) {
        super(label);
        this.colors = colors;
        this.positions = positions;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setPreferredSize(new Dimension(40, 80));
        setFont(new Font("Monospaced", Font.PLAIN, 26));

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
        isPressed = true;
    }

    public void mouseReleased(MouseEvent e) {
        isPressed = false;
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    @Override
    protected void paintComponent(Graphics g) {
        final Graphics2D g2 = (Graphics2D) g.create();
        LinearGradientPaint gx;
        if (!isPressed) {
            gx = new LinearGradientPaint(0, 0, 0, getWidth(), positions, colors);
        } else {
            Color[] darkerColors = new Color[colors.length];
            for (int i = 0; i < colors.length; i++) {
                darkerColors[i] = colors[i].darker();
            }
            gx = new LinearGradientPaint(0, 0, 0, getWidth(), positions, darkerColors);
        }
        g2.setPaint(gx);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();

        super.paintComponent(g);
    }
}