package ru.mirea.it.java.work20;

import java.io.Serializable;

public class Animal implements Serializable {
    private final String name;
    private final String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.voice);
    }

    public String getName() {
        return name;
    }
}
