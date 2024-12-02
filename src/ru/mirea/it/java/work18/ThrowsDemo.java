package ru.mirea.it.java.work18;

public class ThrowsDemo {
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
    }

    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo();
        try {
            t.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
