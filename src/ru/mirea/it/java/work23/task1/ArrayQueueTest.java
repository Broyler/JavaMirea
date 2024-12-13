package ru.mirea.it.java.work23.task1;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(59);
        queue.enqueue(11);
        queue.enqueue(5);
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.element());
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}