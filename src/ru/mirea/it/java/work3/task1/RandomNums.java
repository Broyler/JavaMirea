package ru.mirea.it.java.work3.task1;

import java.util.Arrays;
import java.util.Random;

public class RandomNums {
    private static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; ++i) {
            arr1[i] = (int)Math.round(Math.random() * 20 - 10);
        }
        System.out.println("Изначальный массив 1");
        RandomNums.printArray(arr1, 10);
        Arrays.sort(arr1);
        System.out.println("Сортированный массив 1");
        RandomNums.printArray(arr1, 10);

        Random rand = new Random();
        int[] arr2 = new int[10];
        for (int i = 0; i < 10; ++i) {
            arr2[i] = rand.nextInt(20) - 10;
        }
        System.out.println("Изначальный массив 2");
        RandomNums.printArray(arr2, 10);
        Arrays.sort(arr2);
        System.out.println("Сортированный массив 2");
        RandomNums.printArray(arr2, 10);
    }
}
