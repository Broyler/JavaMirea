package ru.mirea.it.java.work19;

public record Student(String name, double gpa) implements Comparable<Student> {
    @Override
    public String toString() {
        return name + ", gpa=" + gpa;
    }

    @Override
    public int compareTo(Student T) {
        return (int)(T.gpa - gpa);
    }
}
