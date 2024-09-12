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
        List<Integer> nums = new ArrayList<Integer>();
        do {
            int num = scanner.nextInt();
            nums.add(num);
            n++;
        } while (scanner.hasNextInt());

        System.out.print("Получился массив: ");
        int i = 0;
        int min_number = 0;
        int max_number = 0;
        while (i < n) {
            int current_number = nums.get(i);
            System.out.print(current_number + " ");

            if (i == 0) {
                min_number = current_number;
                max_number = current_number;
            }

            if (current_number < min_number)
                min_number = current_number;

            if (current_number > max_number)
                max_number = current_number;

            i++;
        }

        System.out.println();
        System.out.println("Минимальный элемент: " + min_number);
        System.out.println("Максимальный элемент: " + max_number);
    }
}
