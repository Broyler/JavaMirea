package ru.mirea.it.java.work18;

public class ThrowsDemo2 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch ( NullPointerException e ) {
            System.out.println("No data for " + key);
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo2 t = new ThrowsDemo2();
        t.printMessage( "hello" );
        t.printMessage( null );
    }
}
