package ru.mirea.it.java.work13;

public class Task5 {
    private class ConvertPhoneNumber {
        private String number = "";

        public ConvertPhoneNumber(String number) {
            if (number.charAt(0) == '+') {
                this.number += number.substring(0, number.length() - 7) +
                "-" + number.substring(number.length() - 7, number.length() - 4) +
                "-" + number.substring(number.length() - 4);
            } else {
                this.number = "+7" + number.substring(1, 4) +
                        '-' + number.substring(4, 7) +
                        '-' + number.substring(7);
            }
        }

        public String getNumber() {
            return number;
        }
    }

    public Task5() {
        System.out.println((new ConvertPhoneNumber("+104289652211")).getNumber());
        System.out.println((new ConvertPhoneNumber("+79175655655")).getNumber());
        System.out.println((new ConvertPhoneNumber("89175655655")).getNumber());

    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();
    }
}
