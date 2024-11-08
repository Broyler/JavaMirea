package ru.mirea.it.java.work11;

import java.util.*;
import java.text.*;

public class Student {
    private String name;
    private String surname;
    private String course;
    private int term;
    private String group;
    private Date birthday;
    private SimpleDateFormat sdfS;
    private SimpleDateFormat sdfM;
    private SimpleDateFormat sdfL;

    public enum Format {
        SHORT,
        MEDIUM,
        LONG
    }

    public Student(String name, String surname, String course, int term, String group, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.term = term;
        this.group = group;
        this.birthday = birthday;
        this.sdfS = new SimpleDateFormat("dd.MM");
        this.sdfM = new SimpleDateFormat("dd.MM.yy HH:mm");
        this.sdfL = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getCourse() {
        return this.course;
    }

    public int getTerm() {
        return this.term;
    }

    public String getGroup() {
        return this.group;
    }

    public String getBirthday(Format fmt) {
        switch (fmt) {
            case Format.SHORT:
                return this.sdfS.format(this.birthday);

            case Format.MEDIUM:
                return this.sdfM.format(this.birthday);

            case Format.LONG:
                return this.sdfL.format(this.birthday);

            default:
                return this.sdfM.format(this.birthday);
        }
    }

    @Override
    public String toString() {
        return "Student('" + this.name + " " + this.surname + 
            "', " + this.course + ", term " + this.term + ", " + this.group + 
            ", " + this.birthday + ")";
    }
}
