package ru.mirea.it.java.work24.task1;

public class Complex {
    private int real, im;
    public Complex(int real, int im) {
        this.real = real;
        this.im = im;
    }

    @Override
    public String toString() {
        return "Complex = %d + %di".formatted(real, im);
    }
}
