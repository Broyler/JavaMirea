package ru.mirea.it.java.work26;

import java.util.Iterator;
import java.util.List;

public class CustomListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int index = 0;

    public CustomListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements to iterate.");
        }
        return list.get(index++);
    }

    @Override
    public void remove() {
        if (index <= 0) {
            throw new IllegalStateException("You must call next() before calling remove().");
        }
        list.remove(--index);
    }
}
