package ru.mirea.it.java.work10.task1;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private String course;
    private int term;
    private String group;

    public Student(String name, String surname, String course, int term, String group) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.term = term;
        this.group = group;
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

    @Override
    public String toString() {
        return "Student('" + this.name + " " + this.surname + 
            "', " + this.course + ", term " + this.term + ", " + this.group + ")";
    }

    @Override
    public int compareTo(Student T) {
        return T.toString().compareTo(this.toString());
    }
}
