package ru.mirea.it.java.work3.task3;

import java.util.Random;

public class Progression {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();
        boolean isAscending = true;
        for (int i = 0; i < 4; ++i) {
            arr[i] = rand.nextInt(89) + 10;
            System.out.print(arr[i] + " ");
            if (isAscending && i > 0 && arr[i] <= arr[i-1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("Строго возрастает");
        } else {
            System.out.println("Не является строго возр. посл.");
        }
    }
}
