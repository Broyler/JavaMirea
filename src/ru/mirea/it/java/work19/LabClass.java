package ru.mirea.it.java.work19;

import java.util.ArrayList;
import java.util.Collections;

public class LabClass {
    private final ArrayList<Student> students = new ArrayList<>();
    public void sort() {
        Collections.sort(students);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public ArrayList<Student> filterStudents(String startsWith) throws StudentNotFoundException, EmptyStringException {
        ArrayList<Student> out = new ArrayList<>();

        if (startsWith == null || startsWith.isEmpty()) {
            throw new EmptyStringException();
        }

        for (Student student : this.students) {
            if (student.name().startsWith(startsWith)) {
                out.add(student);
            }
        }

        if (out.isEmpty()) {
            throw new StudentNotFoundException();
        }

        return out;
    }
}
