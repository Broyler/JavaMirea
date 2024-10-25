package ru.mirea.it.java.work9.task1;

public class SortTester {
    private class Student implements Comparable<Student> {
        private final int id;
        private final String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public String toString() {
            return "Student(id=" + this.id + ", name=" + this.name + ")";
        }

        @Override
        public int compareTo(Student T) {
            return this.id - T.getId();
        }
    }

    private final Student[] students;
    public SortTester() {
        this.students = new Student[] {
                new Student(4, "Ivan"),
                new Student(2, "John"),
                new Student(5, "Perry"),
                new Student(10, "Larry"),
                new Student(0, "Clyde")
        };
    }

    public static void main(String[] args) {
        SortTester tester = new SortTester();
        InsertionSort.sort(tester.students);
        for (int i = 0; i < tester.students.length; i++) {
            System.out.println(tester.students[i]);
        }
    }
}
