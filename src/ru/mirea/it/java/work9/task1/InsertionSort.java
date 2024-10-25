package ru.mirea.it.java.work9.task1;

public class InsertionSort {
    public static void sort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable temp = list[i];
            int j = i - 1;

            while (j >= 0 && list[j].compareTo(temp) > 0) {
                list[j + 1] = list[j];
                j = j - 1;
            }

            list[j + 1] = temp;
        }
    }
}
