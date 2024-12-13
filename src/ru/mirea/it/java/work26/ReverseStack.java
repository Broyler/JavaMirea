package ru.mirea.it.java.work26;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 11; i++) {
            stack.push(i);
            System.out.print(stack.getLast() + " ");
        }

        for (int i = 0; i < stack.size() / 2; i++) {
            int temp = stack.get(i);
            stack.remove(i);
            stack.add(i, stack.remove(stack.size() - i - 1));
            stack.add(stack.size() - i, temp);
        }

        System.out.println();
        System.out.println("============");

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
    }
}
