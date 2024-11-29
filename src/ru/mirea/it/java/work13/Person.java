package ru.mirea.it.java.work13;

public class Person {
    private String first_name = "";
    private String last_name = "";
    private String middle_name = "";
    private String middle_name_access = "";
    private String first_name_access = "";

    public Person(String last_name) {
        this.last_name = last_name + " ";
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
        this.first_name_access = first_name.charAt(0) + ". ";
    }

    public void setMiddleName(String middle_name) {
        this.middle_name = middle_name;
        this.middle_name_access = middle_name.charAt(0) + ". ";
    }

    @Override
    public String toString() {
        return this.last_name + this.first_name_access + this.middle_name_access;
    }
}
