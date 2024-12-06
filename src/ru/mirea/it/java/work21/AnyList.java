package ru.mirea.it.java.work21;

public class AnyList<E> {
    private Object[] array;

    public AnyList(int size) {
        this.array = new Object[size];
    }

    public Object getIndex(int index) {
        return this.array[index];
    }

    public void set(int index, E e) {
        this.array[index] = e;
    }

    public void print() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i]);
        }
    }
}
