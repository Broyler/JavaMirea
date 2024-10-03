package ru.mirea.it.java.work3.task1;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Currencies {
    public static class Converter {
        private final HashMap<NumberFormat, Double> ratios =
                new HashMap<NumberFormat, Double>(4);
        public Converter() {
            ratios.put(NumberFormat.getCurrencyInstance(Locale.US), 1.0);
            ratios.put(NumberFormat.getCurrencyInstance(Locale.FRANCE), 0.90671);
            ratios.put(NumberFormat.getCurrencyInstance(Locale.JAPAN), 146.77);
            ratios.put(NumberFormat.getCurrencyInstance(Locale.UK), 0.7621);
        }
        public HashMap<NumberFormat, Double> getRatios() {
            return this.ratios;
        }
    }

    public static String convert(double amount, NumberFormat format) {
        double dollarRatio = new Converter().getRatios().get(format);
        return format.format(amount * dollarRatio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество валюты в $USD");
        Locale myLocale = Locale.JAPAN;

        double amount = scanner.nextInt();
        NumberFormat me = NumberFormat.getCurrencyInstance(myLocale);
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US)
                .format(amount) + " is " + convert(200, me));
    }
}
