package ru.mirea.it.java.work22;

public class RPNcalc {
    private final LinkedStack<Double> stack = new LinkedStack<>();

    public LinkedStack<Double> getStack() {
        return stack;
    }

    public void addNum(double num) {
        stack.add(num);
    }

    public void operate(String op) throws NotAnOperation, NotEnoughItems {
        double num1;
        double num2;

        System.out.println(op);

        if (!stack.isOperable()) {
            throw new NotEnoughItems();
        }

        switch (op) {
            case "+":
                stack.add(stack.pop() + stack.pop());
                break;

            case "-":
                num1 = stack.pop();
                num2 = stack.pop();
                stack.add(num2 - num1);
                break;

            case "*":
                stack.add(stack.pop() * stack.pop());
                break;

            case "/":
                num1 = stack.pop();
                num2 = stack.pop();
                stack.add(num2 / num1);
                break;

            default:
                throw new NotAnOperation();
        }
    }

    public void clear() {
        this.stack.clear();
    }

    public double answer() throws NotEnoughItems {
        double answer = stack.pop();
        clear();
        return answer;
    }
}
