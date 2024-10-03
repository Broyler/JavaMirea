package ru.mirea.it.java.work3.task1;

public class Wrappers {
    public static void main(String[] args) {
        String a = "43.12";
        double b = Double.valueOf(a);
        System.out.println(b);

        double c = Double.parseDouble(a);
        System.out.println(c);

        byte c_byte = (byte)c;
        short c_short = (short)c;
        int c_int = (int)c;
        long c_long = (long)c;
        float c_float = (float)c;
        char c_char = (char)c;

        Double d = new Double(124.43);

        System.out.println(c_byte + " " + c_short + " " + c_int
         + " " + c_long + " " + c_float + " " + c_char);

        System.out.println(d.doubleValue());
        System.out.println(Double.doubleToLongBits(d));

        String e = Double.toString(d);
        System.out.println(e);

    }
}
