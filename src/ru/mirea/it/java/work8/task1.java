package ru.mirea.it.java.work8;

public class task1 {
    public static void main(String[] args) {
        final int n = 10;
        int current = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(current + ", ");
            count++;
            if (count >= current) {
                current++;
                count = 0;
            }
        }
    }
}
