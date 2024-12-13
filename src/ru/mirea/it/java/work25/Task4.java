package ru.mirea.it.java.work25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String password = "user@gmail.com";
        Matcher matcher = Pattern.compile("[\\w.]+@[\\w.]+").matcher(password);
        System.out.println(matcher.find());
    }
}

