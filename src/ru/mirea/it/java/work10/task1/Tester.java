package ru.mirea.it.java.work10.task1;

import ru.mirea.it.java.work10.task1.SortStudents;
import ru.mirea.it.java.work10.task1.Student;

public class Tester {
    private Student[] students;
    private Student[] otherStudents;

    public Tester() {
        this.students = new Student[] {
            new Student("Alex", "Johns", "Aeronautics", 3, "AEUO-3"),
            new Student("Jonny", "Buscuit", "International business", 1, "IB-MIT"),
            new Student("Zed", "Leppelin", "Music", 5, "MTAP-CAU-1-97")
        };
        this.otherStudents = new Student[] {
            new Student("Alex", "Johns", "Aeronautics", 4, "AEUO-3"),
            new Student("Alex", "Johns", "Aeronautics", 4, "AAUO-3"),
            new Student("Renat", "Sharipov", "Computer science", 2, "KVBO-07-23"),
        };
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        SortStudents.sort(tester.students);
        for (int i = 0; i < tester.students.length; i++) {
            System.out.println(tester.students[i]);
        }

        System.out.println("All students:");

        Student[] allStudents = new Student[tester.students.length + tester.otherStudents.length];
        for (int i = 0; i < tester.students.length; i++) {
            allStudents[i] = tester.students[i];
        }

        for (int i = 0; i < tester.otherStudents.length; i++) {
            allStudents[i + tester.students.length] = tester.otherStudents[i];
        }

        SortStudents.sort(allStudents);

        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(allStudents[i]);
        }
    }
}
