package ru.mirea.it.java.work19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LabClassUI extends JFrame implements ActionListener {
    private final LabClass lab = new LabClass();
    private final DefaultListModel<String> listModel;
    private static JTextArea textArea;

    private void addStudents() {
        lab.addStudent(new Student("Alex Johns", 4.1));
        lab.addStudent(new Student("Xavier S.", 4.1));
        lab.addStudent(new Student("Petros E.", 2.1));
        lab.addStudent(new Student("Alexandro P.", 3.6));
        lab.addStudent(new Student("Renato Sherpa", 4.9));
    }

    private void initLab() {
        this.addStudents();
        this.lab.sort();
        for (Student student : this.lab.getStudents()) {
            this.listModel.addElement(student.toString());
        }
    }

    public LabClassUI() {
        super("Lab Class");
        this.listModel = new DefaultListModel<>();
        this.initLab();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        textArea = new JTextArea();
        textArea.setColumns(20);
        JButton button = new JButton("Поиск");
        button.addActionListener(this);
        panel.add(textArea);
        panel.add(button);
        add(panel, BorderLayout.NORTH);
        JList<String> studList = new JList<>(listModel);
        add(studList, BorderLayout.CENTER);
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabClassUI();
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Поиск")) {
            String text = textArea.getText();

            try {
                ArrayList<Student> students = lab.filterStudents(text);
                String msg = "Найденные студенты: \n";
                for (Student student : students) {
                    msg += student.toString() + "\n";
                }
                JOptionPane.showMessageDialog(null, msg);
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            textArea.setText("");
        }
    }
}
