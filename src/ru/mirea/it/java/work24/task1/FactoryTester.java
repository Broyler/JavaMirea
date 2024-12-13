package ru.mirea.it.java.work24.task1;

public class FactoryTester {
    public static void main(String[] args) {
        FactoryExample factory = new FactoryExample();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(2, 2);
        System.out.println(complex1 + "\n" + complex2);
    }
}
