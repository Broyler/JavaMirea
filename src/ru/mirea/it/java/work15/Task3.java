package ru.mirea.it.java.work15;

import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {
    public Task3() {
        super("Task 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        setJMenuBar(createMenuBar());
        setSize(300, 300);
        setVisible(true);

        JTextField jtf = new JTextField(20);
        jtf.setPreferredSize(new Dimension(100, 60));
        add(jtf, BorderLayout.NORTH);
        Panel panel = new Panel();
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        add(panel, BorderLayout.CENTER);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createHelpMenu());
        return menuBar;
    }

    private JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Правка");
        JMenuItem cutItem = new JMenuItem("Копировать");
        editMenu.add(cutItem);
        JMenuItem copyItem = new JMenuItem("Вырезать");
        editMenu.add(copyItem);
        JMenuItem pasteItem = new JMenuItem("Править");
        editMenu.add(pasteItem);
        return editMenu;
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem newItem = new JMenuItem("Сохранить");
        fileMenu.add(newItem);
        JMenuItem openItem = new JMenuItem("Выйти");
        fileMenu.add(openItem);
        return fileMenu;
    }

    private JMenu createHelpMenu() {
        JMenu fileMenu = new JMenu("Справка");
        JMenuItem newItem = new JMenuItem("Онлайн-помощь.");
        fileMenu.add(newItem);
        return fileMenu;
    }

    public static void main(String[] args) {
        new Task3();
    }
}
