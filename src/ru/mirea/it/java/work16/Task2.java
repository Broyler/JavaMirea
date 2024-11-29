package ru.mirea.it.java.work16;

import javax.swing.*;
import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Service auth");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField serviceField = new JTextField(15);
        JTextField loginField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);

        JLabel serviceLabel = new JLabel("Service:");
        JLabel loginLabel = new JLabel("Login:");
        JLabel passwordLabel = new JLabel("Password:");

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(serviceField, gbc);

        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(serviceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(loginField, gbc);

        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(loginLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(passwordLabel, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
