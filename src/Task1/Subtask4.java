package Task1;

import Solution.ITask;

public class Subtask4 implements ITask {
    public void execute() {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i < 11; ++i) {
            double harmonic_number = 1f / i;
            System.out.printf("Число %d: %.3f\n", i, harmonic_number);
        }
    }
}
