package ru.mirea.it.java.work11;

import java.util.*;
import java.text.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.yyyy-HH:mm:ss");
        String input = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy-HH:mm:ss");
        sdf.setLenient(false);

        try {
            Date d = new Date();
            Date user = sdf.parse(input);

            System.out.println("Введенная дата: " + sdf.format(user));
            System.out.println("Текущая дата: " + sdf.format(d));

            if (d.after(user)) {
                System.out.println("Введенная дата раньше текущей.");
            } else if (d.before(user)) {
                System.out.println("Введенная дата еще не наступила.");
            } else {
                System.out.println("Введенная дата равна текущей.");
            }
        } catch (ParseException e) {
            System.out.println("Дата введена в неправильном формате");
        }
    }
}
