package ru.mirea.it.java.work23.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;

        if (args.length != 1) {
            System.out.println("Значение x не указано. Пожалуйста, введите значение x:");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    x = Double.parseDouble(scanner.nextLine());
                    break; // Выход из цикла при корректном вводе
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Попробуйте снова:");
                }
            }
        } else {
            try {
                x = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод аргумента. Используйте только числа.");
                return;
            }
        }

        // 4x^2 - 28x + 49
        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Const(4), new Multiply(new Variable("x"), new Variable("x"))),
                        new Multiply(new Const(28), new Variable("x"))
                ),
                new Const(49)
        );

        double result = expression.evaluate(x);
        System.out.println("Результат вычисления: " + result);
    }
}
