package Task1;

import Solution.ITask;

import java.util.Scanner;

public class Subtask5 implements ITask {
    private final Scanner scanner;

    public Subtask5(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute() {
        System.out.print("Введите число для факториала: ");
        int number = this.scanner.nextInt();
        int result = this.factorial(number);
        System.out.printf("%d! = %d", number, result);
    }

    private int factorial(int number) {
        if (number <= 1) return 1;
        return number * this.factorial(number - 1);
    }
}
