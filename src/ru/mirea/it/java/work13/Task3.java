package ru.mirea.it.java.work13;

import ru.mirea.it.java.work13.Address;

public class Task3 {
    public static void main(String[] args) {
        Address address = new Address("Россия, Московская область, Москва, ул. Маршала Катукова, дом 15, корпус 1, квартира 13");
        System.out.println(address);
        Address address1 = new Address("Rossiya, Mosk obl, Moskva, ulitsa Mashala Katukova, dom 15, korpus 1, kvartira 13", true);
        System.out.println(address1);
        Address address2 = new Address("Aa,Bb,Cc.;,Dd,Ee,Ff,Gg");
        System.out.println(address2);
        Address address3 = new Address("Aa,Bb;Cc.Dd,Ee;Ff.Gg", true);
        System.out.println(address3);
    }
}
