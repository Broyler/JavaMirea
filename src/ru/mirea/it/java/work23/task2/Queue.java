package ru.mirea.it.java.work23.task2;

public interface Queue<E> {
    void enqueue(E item);
    E dequeue();
    E element();
    int size();
    boolean isEmpty();
    void clear();
    void display();
}
