package ru.mirea.it.java.work11;

import java.util.*;
import java.text.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Николин");
        Date d = new Date();
        Calendar tasked = Calendar.getInstance();
        tasked.set(Calendar.YEAR, 2024);
        tasked.set(Calendar.MONTH, Calendar.SEPTEMBER);
        tasked.set(Calendar.DAY_OF_MONTH, 15);
        tasked.set(Calendar.HOUR_OF_DAY, 9);
        tasked.set(Calendar.MINUTE, 15);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss");

        System.out.println("Защита: " + sdf.format(d.getTime()));
        System.out.println("Получено: " + sdf.format(tasked.getTime()));
    }
}
