package ru.mirea.it.java.work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String password = "user@localhost";
        Matcher matcher = Pattern.compile("[\\w.]+@[\\w.]+").matcher(password);
        System.out.println(matcher.find());
    }
}
