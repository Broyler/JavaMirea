package ru.mirea.it.java.work25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String str = "(1 +   8) – 9 / 4";
        Matcher matcher = Pattern.compile("\\+ *\\d").matcher(str);
        System.out.println(matcher.find());
    }
}

