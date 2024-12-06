package ru.mirea.it.java.work21;

import java.util.ArrayList;

public class AnyArray {
    ArrayList<Object> arr = new ArrayList<>();

    public void add(Object obj) {
        arr.add(obj);
    }

    public void print() {
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
