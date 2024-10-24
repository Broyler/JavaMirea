package ru.mirea.it.java.work8;

public class task2 {
    private static int count(int prev, int n) {
        if (prev >= n) {
            System.out.print(n);
            return n;
        }
        System.out.print(prev + " ");
        return count(prev + 1, n);
    }
    public static void main(String[] args) {
        count(1, 10);
    }
}
