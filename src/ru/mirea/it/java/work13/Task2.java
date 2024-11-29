package ru.mirea.it.java.work13;

import ru.mirea.it.java.work13.Person;

public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("Вихорьков");
        System.out.println(person);
        person.setFirstName("Игорь");
        System.out.println(person);
        person.setMiddleName("Александрович");
        System.out.println(person);
    }
}
