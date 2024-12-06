package ru.mirea.it.java.work21;

public class AnyListTester {
    public static void main(String[] args) {
        AnyList<Integer> ints = new AnyList<>(4);
        ints.set(0, 5);
        ints.set(1, 2);
        ints.print();

        System.out.println("-------------");

        AnyList<String> strs = new AnyList<>(3);
        strs.set(0, "Hello");
        strs.set(1, "World");
        strs.print();
    }
}
