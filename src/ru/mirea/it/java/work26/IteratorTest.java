package ru.mirea.it.java.work26;


import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(111);
        myList.add(222);
        myList.add(333);

        CustomListIterator<Integer> iterator = new CustomListIterator<>(myList);

        System.out.println("Iterating over the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Removing an element using custom iterator:");
        iterator = new CustomListIterator<>(myList);
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
