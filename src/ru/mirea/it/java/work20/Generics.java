package ru.mirea.it.java.work20;

import java.io.Serializable;

public class Generics<T extends Comparable, V extends Animal, K> {
    private T t;
    private V v;
    private K k;

    public Generics(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void getTypes() {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
        System.out.println(k.getClass().getSimpleName());
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
