package ru.mirea.it.java.work19;

import java.util.ArrayList;

public class OnlineShop {
    public class InvalidINN extends Exception {
        public InvalidINN() {
            super("Not a valid INN!");
        }
    }

    public void getInn(String inn, ArrayList<String> inns) throws InvalidINN {
        if (inns.contains(inn)) {
            System.out.println("Inn " + inn + " was found!");
        } else {
            throw new InvalidINN();
        }
    }

    public void checkInn(String inn, ArrayList<String> inns) {
        try {
            getInn(inn, inns);
        } catch (InvalidINN e) {
            System.out.println("Not a valid inn " + inn + "!!!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> inns = new ArrayList<String>();
        inns.add("4331");
        inns.add("1235");
        OnlineShop shop = new OnlineShop();
        shop.checkInn("4331", inns);
        shop.checkInn("1235", inns);
        shop.checkInn("0123", inns);
    }
}
