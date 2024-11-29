package ru.mirea.it.java.work13;

public class Task1 {
    private void checkString(String str) {
        System.out.println("Последний символ - " + str.charAt(str.length() - 1));
        System.out.println("Заканчивается ли !!! - " + (str.endsWith("!!!") ? "да" : "нет"));
        System.out.println("Начинается ли с I like - " + (str.startsWith("I like") ? "да" : "нет"));
        System.out.println("Содержит Java - " + (str.contains("Java") ? "да" : "нет"));
        System.out.println("Позиция Java в \"I like Java!!!\" - " + "I like Java".indexOf("Java"));
        System.out.println("Заменили все а на о - " +
                str.replace("а", "о")
                        .replace("a", "o")
        );
        System.out.println("В верхнем регистре - " + str.toUpperCase());
        System.out.println("В нижнем регистре - " + str.toLowerCase());

        if (str.contains("Java")) {
            System.out.println("Вырезали \"Java\" - " + str.substring(0, str.indexOf("Java")) +
                    str.substring(str.indexOf("Java") + "Java".length()));
        } else
            System.out.println("В строке не содержится \"Java\"! Нечего вырезать.");
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.checkString("I like Java!!!");
    }
}
