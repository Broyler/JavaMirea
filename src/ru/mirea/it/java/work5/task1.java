package ru.mirea.it.java.work5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1 extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;
    private String lastScorer = "N/A";

    // Компоненты GUI
    private JLabel resultLabel = new JLabel("Result: 0 X 0");
    private JLabel lastScorerLabel = new JLabel("Last Scorer: " + lastScorer);
    private JLabel winnerLabel = new JLabel("Winner: DRAW");
    private JButton milanButton = new JButton("AC Milan");
    private JButton madridButton = new JButton("Real Madrid");

    public task1() {
        // Настройка окна JFrame
        setTitle("Football Match: AC Milan vs Real Madrid");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Добавление компонентов на окно
        JPanel total = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);
        total.add(buttonPanel);
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.add(resultLabel);
        textPanel.add(lastScorerLabel);
        textPanel.add(winnerLabel);
        total.add(textPanel);
        total.setLayout(new BoxLayout(total, BoxLayout.Y_AXIS));
        add(total);

        // Обработчики нажатий кнопок
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                lastScorer = "AC Milan";
                updateScore();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                lastScorer = "Real Madrid";
                updateScore();
            }
        });
    }

    // Метод для обновления результатов на экране
    private void updateScore() {
        resultLabel.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        if (scoreMilan > scoreMadrid) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (scoreMadrid > scoreMilan) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        // Запуск программы
        task1 match = new task1();
        match.setVisible(true);
    }
}
