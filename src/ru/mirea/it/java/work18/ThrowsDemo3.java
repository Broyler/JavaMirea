package ru.mirea.it.java.work18;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        while (true) {
            String key = myScanner.next();
            try {
                printDetails(key);
            } catch ( Exception e ) {
                System.out.println( "Non-existent key, try again..." );
                continue;
            }
            break;
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "none")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        new ThrowsDemo3().getKey();
    }
}
