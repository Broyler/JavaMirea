package ru.mirea.it.java.work9.task2;

import java.util.Comparator;

public class StudentTester {
    private class StudentComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.getGpa(), s2.getGpa());
        }
    }

    private class Student implements Comparable<Student> {
        private final String name;
        private final double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public int compareTo(Student o) {
            StudentComparator comp = new StudentComparator();
            return comp.compare(this, o);
        }

        @Override
        public String toString() {
            return "Student(name=" + name + ", gpa=" + gpa + ")";
        }
    }

    private Student[] students;
    public StudentTester() {
        this.students = new Student[] {
                new Student("Mary", 2.5),
                new Student("John", 4.5),
                new Student("Jack", 1.8),
                new Student("Jane", 5.5),
                new Student("Noel", 3.2)
        };
    }

    public static void main(String[] args) {
        StudentTester tester = new StudentTester();
        QuickSort.sort(tester.students);
        for (int i = 0; i < tester.students.length; i++) {
            System.out.println(tester.students[i]);
        }
    }
}
