package ru.mirea.it.java.work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 extends JFrame {
    JTextField jtf;
    public Task3() {
        super("Task 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        setJMenuBar(createMenuBar());
        setSize(300, 300);
        setVisible(true);

        jtf = new JTextField(20);
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
        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringSelection stringSelection = new StringSelection(jtf.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        });
        editMenu.add(cutItem);
        JMenuItem copyItem = new JMenuItem("Вырезать");
        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringSelection stringSelection = new StringSelection(jtf.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                jtf.setText("");
            }
        });
        editMenu.add(copyItem);
        JMenuItem pasteItem = new JMenuItem("Править");
        editMenu.add(pasteItem);
        return editMenu;
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem newItem = getJMenuItem();
        fileMenu.add(newItem);
        JMenuItem openItem = new JMenuItem("Выйти");
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(openItem);
        return fileMenu;
    }

    private JMenuItem getJMenuItem() {
        JMenuItem newItem = new JMenuItem("Сохранить");
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = jtf.getText();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("src/ru/mirea/it/java/work15/output.txt"));
                    writer.write(text);
                    writer.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        return newItem;
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
