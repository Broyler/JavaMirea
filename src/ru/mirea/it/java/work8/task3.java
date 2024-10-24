package ru.mirea.it.java.work8;

import java.util.List;
import java.util.Scanner;

public class task3 {
    private static int regr(int start, int end, int step) {
        if (start == end) {
            System.out.println(end);
            return end;
        }
        System.out.print(start + " ");
        return regr(start + step, end, step);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        regr(start, end, start < end ? 1 : -1);
    }
}
