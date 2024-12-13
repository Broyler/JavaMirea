package ru.mirea.it.java.work23.task1;

public class ArrayQueueModuleTest {
    public static void main(String[] args) {
        ArrayQueueModule queue = new ArrayQueueModule();
        ArrayQueueModule.enqueue(111);
        ArrayQueueModule.enqueue(222);
        ArrayQueueModule.enqueue(333);
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.element());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());
    }
}
