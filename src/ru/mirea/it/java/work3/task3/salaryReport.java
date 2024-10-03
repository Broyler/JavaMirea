package ru.mirea.it.java.work3.task3;

public class salaryReport {
    private static class Employee {
        String fullName;
        double salary;

        public Employee(String fullName, double salary) {
            this.fullName = fullName;
            this.salary = salary;
        }
    }

    private class Report {
        public static void generateReport(Employee[] employees) {
            for (Employee employee : employees) {
                System.out.printf("%-20s$%,10.2f", employee.fullName,
                        employee.salary);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Bob Steel", 45000),
                new Employee("Alex Waxer", 51500),
                new Employee("John Beehive", 56000)
        };
        Report.generateReport(employees);
    }
}
