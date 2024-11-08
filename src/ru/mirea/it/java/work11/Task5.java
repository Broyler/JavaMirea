package ru.mirea.it.java.work11;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList add: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList add: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i, i);
        }
        System.out.println("ArrayList insert: " + (System.currentTimeMillis() - start));
  
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i, i);
        }
        System.out.println("LinkedList insert: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 500; i < 1000; i++) {
            arrayList.remove(i);
        }
        System.out.println("ArrayList remove: " + (System.currentTimeMillis() - start));
 
        start = System.currentTimeMillis();
        for (int i = 500; i < 1000; i++) {
            linkedList.remove(i);
        }
        System.out.println("LinkedList remove: " + (System.currentTimeMillis() - start));
    }
}
