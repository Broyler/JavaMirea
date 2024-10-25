package ru.mirea.it.java.work6.task4;

public class Priceables {
    private class Apple implements Priceable {
        public double getPrice() {
            return 1.29;
        }
    }

    private class Waffles implements Priceable {
        public double getPrice() {
            return 4.99;
        }
    }

    private final Priceable apple;
    private final Priceable waffle;
    public Priceables() {
        this.apple = new Apple();
        this.waffle = new Waffles();
    }

    public static void main(String[] args) {
        Priceables p = new Priceables();
        System.out.println(p.apple.getPrice());
        System.out.println(p.waffle.getPrice());
    }
}
