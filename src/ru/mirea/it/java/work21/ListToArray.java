package ru.mirea.it.java.work21;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static <E> void convert(E[] arr, ArrayList<E> list) {
        list.addAll(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListToArray.<Integer>convert(arr, list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
