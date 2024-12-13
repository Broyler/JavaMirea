package ru.mirea.it.java.work22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalcUI extends JFrame implements ActionListener, KeyListener {
    String currentNumber = "";
    String builtExpression = "";
    JTextField input;
    RPNcalc calc = new RPNcalc();

    public CalcUI() {
        super("RPN калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 420);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setVisible(true);

        JPanel buttons = new JPanel();
        GridLayout gridLayout = new GridLayout(4, 4);
        buttons.setLayout(gridLayout);

        Color[] gradColors = new Color[] {
                new Color(189, 153, 255),
                new Color(219, 158, 255),
                new Color(189, 153, 255),
        };
        float[] gradPositions = new float[] {0f, 0.7f, 1f};

        String labels = "789/456*123-0N+=";
        for (int i = 0; i < labels.length(); i++) {
            JButton btn = new JGradientButton(Character.toString(labels.charAt(i)), gradColors, gradPositions);
            btn.addActionListener(this);
            buttons.add(btn);
        }

        input = new JTextField("", 20);
        input.setPreferredSize(new Dimension(40, 70));
        input.setEditable(false);
        input.setFont(new Font("Monospaced", Font.PLAIN, 26));

        add(input, BorderLayout.NORTH);
        add(buttons, BorderLayout.SOUTH);
    }


    public void keyPressed(KeyEvent arg0) {
        char c = arg0.getKeyChar();
        System.out.println(c);
        applyInput(Character.toString(c).toLowerCase());
    }

    public void keyReleased(KeyEvent arg0) {
        char c = arg0.getKeyChar();
        System.out.println("Released " + c);
    }

    public void keyTyped(KeyEvent arg0) {
        char c = arg0.getKeyChar();
        System.out.println("Typed " + c);
    }


    private void finishNumber() {
        if (currentNumber.equals("")) { return; }
        int t = Integer.parseInt(currentNumber);
        builtExpression += currentNumber + " ";
        currentNumber = "";
        calc.addNum(t);
    }

    private void applyInput(String t) {
        if ("0123456789".contains(t)) {
            if (currentNumber.startsWith("0")) {
                currentNumber = t;
                input.setText(builtExpression + currentNumber);
                return;
            }
            currentNumber += t;
            input.setText(builtExpression + currentNumber);
        } else if ("/*-+".contains(t)) {
            try {
                finishNumber();
                calc.operate(t);
                builtExpression += t + " ";
                input.setText(builtExpression);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Невозможно выполнить операцию. Неправильное уравнение.");
            }
        } else if (t.equals("N")) {
            finishNumber();
        } else if (t.equals("=")) {
            finishNumber();

            try {
                double ans = calc.answer();
                if (ans % 1 == 0) {
                    input.setText("" + (int) ans);
                } else {
                    input.setText(String.format("%.4f", ans));
                }
            } catch (NotEnoughItems _) {}
            currentNumber = "";
            builtExpression = "";
        }
    }

    public void actionPerformed(ActionEvent e) {
        String t = e.getActionCommand();

        applyInput(t);
    }

    public static void main(String[] args) {
        new CalcUI();
    }
}
