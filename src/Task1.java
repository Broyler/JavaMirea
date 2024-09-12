import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import Task1.*;
import Solution.ITask;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ITask> tasks = new ArrayList<>();
        tasks.add(new Subtask1(scanner));
        tasks.add(new Subtask2(scanner));
        tasks.add(new Subtask3(args));
        tasks.add(new Subtask4());
        tasks.add(new Subtask5(scanner));

        for (ITask task : tasks) {
            task.execute();
        }
    }
}
