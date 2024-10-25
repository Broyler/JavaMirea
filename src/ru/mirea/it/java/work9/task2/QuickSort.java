package ru.mirea.it.java.work9.task2;

public class QuickSort {
    public static void sort(Comparable[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(Comparable[] list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private static int partition(Comparable[] list, int low, int high) {
        Comparable pivot = list[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list[j].compareTo(pivot) > 0) {
                i++;

                Comparable temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        Comparable temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }
}