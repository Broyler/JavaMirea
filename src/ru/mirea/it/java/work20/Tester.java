package ru.mirea.it.java.work20;

public class Tester {
    public static void main(String[] args) {
        Generics<String, Animal, Double> generics = new Generics<>("Hello world!", new Animal("Cat", "Meow"), 0.45);
        generics.getTypes();
        System.out.println("T=" + generics.getT());
        System.out.println("V=" + generics.getV());
        System.out.println("K=" + generics.getK());
        generics.getV().speak();
    }
}
