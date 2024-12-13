package ru.mirea.it.java.work24.task3;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UI extends JFrame {
    private final JTextArea textArea;
    private final JMenuBar menuBar;

    private CreateTextDocument documentFactory;
    private TextDocument textDocument;

    public UI() {
        setTitle("new file - MIREA24 text editor");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        documentFactory = new CreateTextDocument();
        textDocument = documentFactory.CreateNew();

        textArea = new JTextArea();
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                onTextFieldChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                onTextFieldChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                onTextFieldChange();
            }
        });
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textArea.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = getFileMenu();

        // Colors
        JMenu colorMenu = getColorMenu();

        menuBar.add(fileMenu);
        menuBar.add(colorMenu);

        setJMenuBar(menuBar);

        setVisible(true);
    }

    private void onTextFieldChange() {
        if (!textDocument.lastSavedData.equals(textArea.getText())) {
            setTitle(textDocument.fileName + "* - MIREA24 text editor");
        } else {
            setTitle(textDocument.fileName + " - MIREA24 text editor");
        }
        textDocument.setContents(textArea.getText());
    }

    private JMenu getFileMenu() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // New
        fileMenu.add(newItem);
        newItem.addActionListener(e -> {
            textArea.setText("");
            textDocument = documentFactory.CreateNew();
            onTextFieldChange();
        });


        // Open
        fileMenu.add(openItem);
        openItem.addActionListener(e -> {
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            JFileChooser j = new JFileChooser(s);

            int r = j.showSaveDialog(this);

            if (r == JFileChooser.APPROVE_OPTION) {
                String filePath = j.getSelectedFile().getAbsolutePath();
                try {
                    textDocument = documentFactory.CreateOpen(filePath);
                    textArea.setText(textDocument.getContents());
                } catch (FileNotFoundException _) {
                    JOptionPane.showMessageDialog(this, "No such file. Open failed.");
                }
            }
            onTextFieldChange();
        });

        // Save
        fileMenu.add(saveItem);
        saveItem.addActionListener(e -> {
            try {
                textDocument.save();
            } catch (IOException _) {
                JOptionPane.showMessageDialog(this, "File save failed. Please check the file name or reload the program.");
            } catch (RuntimeException _) {
                Path currentRelativePath = Paths.get("");
                String s = currentRelativePath.toAbsolutePath().toString();
                JFileChooser j = new JFileChooser(s);

                int r = j.showSaveDialog(this);

                if (r == JFileChooser.APPROVE_OPTION) {
                    String filePath = j.getSelectedFile().getAbsolutePath();
                    textDocument.setFName(filePath);
                    try {
                        textDocument.save();
                    } catch (IOException _) {}
                } else {
                    return;
                }
            }
            onTextFieldChange();
        });

        // Exit
        fileMenu.add(exitItem);
        exitItem.addActionListener(e -> {
            System.exit(0);
        });
        return fileMenu;
    }

    private JMenu getColorMenu() {
        JMenu colorMenu = new JMenu("Color");
        JMenuItem blueItem = new JMenuItem("Blue");
        JMenuItem redItem = new JMenuItem("Red");
        JMenuItem blackItem = new JMenuItem("Black");

        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        return colorMenu;
    }
}

