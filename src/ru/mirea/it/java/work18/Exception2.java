package ru.mirea.it.java.work18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2.0/i );
//        } catch (Exception e) {
//            System.out.println( "Перехват обычного exception" );
        } catch (NumberFormatException e) {
            System.out.println("Введено не число.");
        } finally {
            myScanner.close();
            System.out.println("Программа завершается.");
        }
    }

    public static void main(String[] args) {
        Exception2 exception = new Exception2();
        exception.exceptionDemo();
    }
}
