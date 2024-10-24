package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Solution.ITask;

public class Subtask2 implements ITask {
    private final Scanner scanner;

    public Subtask2(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute() {
        int n = 0;
        List<Integer> numbers = new ArrayList<>();

        int min_number = -9999;
        int max_number = 9999;

        do {
            int num = scanner.nextInt();
            numbers.add(num);
            min_number = num < min_number ? num : min_number;
            max_number = num > max_number ? num : max_number;
            n++;
        } while (scanner.hasNextInt());

        System.out.print("Получился массив: ");
        int i = 0;
        System.out.println();
        System.out.println("Минимальный элемент: " + min_number);
        System.out.println("Максимальный элемент: " + max_number);
    }
}
