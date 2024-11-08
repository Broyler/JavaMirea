package ru.mirea.it.java.work11;

import ru.mirea.it.java.work11.Student;

import java.util.*;
import java.text.*;

public class Task3 {
    private Student testStudent;

    public Task3() {
        this.testStudent = new Student("Alex", "Black", "Compsci", 3, "ASD-123",
            new Date(2005, 5, 18, 7, 49, 15)
        );
    }

    public static void main(String[] args) {
        Task3 tester = new Task3();
        System.out.println(tester.testStudent);
        System.out.println(tester.testStudent.getBirthday(Student.Format.SHORT));
        System.out.println(tester.testStudent.getBirthday(Student.Format.MEDIUM));
        System.out.println(tester.testStudent.getBirthday(Student.Format.LONG));
    }
}
