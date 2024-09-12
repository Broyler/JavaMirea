package Task1;
import Solution.ITask;

public class Subtask3 implements ITask{
    private final String[] args;

    public Subtask3(String[] args) {
        this.args = args;
    }

    public void execute() {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
