package ru.mirea.it.java.work13;

import java.util.ArrayList;
import java.util.Objects;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> used = new ArrayList<String>();

        for (int i = 0; i < args.length; i++) {
            for (String arg : args) {
                if (i == 0) {
                    used.add(arg);
                    sb.append(arg).append(" ");
                    break;
                } else if (!used.contains(arg) && Character.toLowerCase(sb.charAt(sb.length() - 2)) == Character.toLowerCase(arg.charAt(0))) {
                    used.add(arg);
                    sb.append(arg).append(" ");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
