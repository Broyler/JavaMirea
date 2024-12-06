package ru.mirea.it.java.work17;

public class DLLBS {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(4);
        list.add(1);
        list.add(10);
        list.add(7);
        list.add(8);
        list.add(3);

        list.print();
        System.out.println();
        list.sort();
        list.print();
    }
}
