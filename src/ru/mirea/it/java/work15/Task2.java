package ru.mirea.it.java.work15;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

public class Task2 extends JFrame implements ItemListener {
    JLabel label;
    JComboBox<String> comboBox;
    JTextArea desc;
    String russia;
    String czech;
    String angola;
    String portugal;

    Task2() {
        super("Task 2, countries");

        this.russia = """
Россия — самая большая страна в мире, занимающая более 17 миллионов квадратных километров, что составляет примерно 11% всей суши на планете.
Озеро Байкал в России — самое глубокое в мире, его глубина достигает 1642 метров, и оно содержит около 20% всех пресных водных ресурсов Земли.""";
        this.czech = """
Чехия — страна с самой высокой концентрацией замков в мире: здесь насчитывается более 2000 замков, крепостей и руин.
Карлов мост в Праге, построенный в XIV веке, украшен 30 скульптурами и считается одной из главных достопримечательностей Европы, сохраняя уникальный средневековый облик.
""";
        this.portugal = """
Португалия — родина самого старого винного региона в мире, долины Дору, где с XVIII века производят знаменитый портвейн.
Лиссабон, столица Португалии, старше Рима более чем на 400 лет и считается одним из старейших городов Европы, с богатой историей, уходящей вглубь финикийских времен.            
""";
        this.angola = """
Ангола является одной из немногих стран, где находится уникальное растение Welwitschia mirabilis, которое может жить более 1000 лет, сохраняясь в условиях пустыни Намиб.
В Анголе расположен второй по величине водопад Африки — водопад Руакана, который не только впечатляет своей красотой, но и играет важную роль в выработке гидроэлектроэнергии для региона.      
""";
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 400);

        String countries[] = {"Россия", "Португалия", "Чехия", "Ангола"};
        comboBox = new JComboBox<String>(countries);
        comboBox.addItemListener(this);

        label = new JLabel("Факты о странах");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        desc = new JTextArea(this.russia);
        desc.setEditable(false);
        desc.setLineWrap(true);
        desc.setWrapStyleWord(true);
        desc.setOpaque(false);
        desc.setMargin(new Insets(20, 0, 0, 0));
        label.setForeground(Color.BLUE);
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(comboBox);
        panel.add(desc);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            switch (Objects.requireNonNull(comboBox.getSelectedItem()).toString()) {
                case "Россия":
                    this.desc.setText(this.russia);
                    break;

                case "Чехия":
                    this.desc.setText(this.czech);
                    break;

                case "Ангола":
                    this.desc.setText(this.angola);
                    break;

                case "Португалия":
                    this.desc.setText(this.portugal);
                    break;

                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Task2();
    }
}