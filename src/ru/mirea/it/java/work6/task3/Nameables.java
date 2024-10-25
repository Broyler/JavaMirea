package ru.mirea.it.java.work6.task3;

public class Nameables {
    private class Tablet implements Nameable {
        public String getName() {
            return "Планшет";
        }
    }

    private class Phone implements Nameable {
        public String getName() {
            return "Телефон";
        }
    }

    Tablet tablet;
    Phone phone;
    public Nameables() {
        this.tablet = new Tablet();
        this.phone = new Phone();
    }

    public static void main(String[] args) {
        Nameables nameables = new Nameables();
        System.out.println(nameables.phone.getName());
        System.out.println(nameables.tablet.getName());
    }
}
