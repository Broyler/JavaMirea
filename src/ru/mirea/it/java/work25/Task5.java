package ru.mirea.it.java.work25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String password = "smSap_as3s";
        Matcher matcher = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*_)").matcher(password);
        System.out.println(matcher.find());
    }
}

