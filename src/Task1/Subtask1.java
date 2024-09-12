package Task1;

import java.util.Scanner;
import Solution.ITask;

public class Subtask1 implements ITask {
    private final Scanner scanner;

    public Subtask1(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute() {
        System.out.println("Введите количество чисел.");
        int n = this.scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            arr[i] = this.scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("Получился массив:");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Сумма чисел: " + sum);
        System.out.println("Ср. арифметическое: " + (float)sum / n);
    }
}
