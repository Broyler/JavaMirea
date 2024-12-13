package ru.mirea.it.java.work24.task1;

public class FactoryExample implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex(1, 1);
    }

    @Override
    public Complex createComplex(int real, int im) {
        return new Complex(real, im);
    }
}
