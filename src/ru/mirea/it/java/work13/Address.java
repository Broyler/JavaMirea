package ru.mirea.it.java.work13;

import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    public final String street;
    public final String houseNumber;
    public final String building;
    public final String apartment;

    public Address(String address) {
        String[] split = address.split(",");
        this.country = split[0].trim();
        this.region = split[1].trim();
        this.city = split[2].trim();
        this.street = split[3].trim();
        this.houseNumber = split[4].trim();
        this.building = split[5].trim();
        this.apartment = split[6].trim();
    }

    public Address(String address, boolean tokenized) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        this.country = tokenizer.nextToken();
        this.region = tokenizer.nextToken();
        this.city = tokenizer.nextToken();
        this.street = tokenizer.nextToken();
        this.houseNumber = tokenizer.nextToken();
        this.building = tokenizer.nextToken();
        this.apartment = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "Страна - " + this.country +
                "\nРегион - " + this.region +
                "\nГород - " + this.city +
                "\nУлица - " + this.street +
                "\nДом - " + this.houseNumber +
                "\nКорпус - " + this.building +
                "\nКвартира - " + this.apartment +
                "\n--------------------------------";
    }
}
