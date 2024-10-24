package ru.mirea.it.java.work4.task1;

public class Enumerations {
    private enum Month {
        JAN(-7.2),
        FEB(-9.1),
        MAR(-2.5),
        APR(5.2),
        MAY(10.7),
        JUN(18.2),
        JUL(23.5),
        AUG(22.1),
        SEP(18.1),
        OCT(15.1),
        NOV(5.9),
        DEC(-2.5);

        private final double avgTemp;

        private Month(double temp) {
            this.avgTemp = temp;
        }

        public int getNumber() {
            return this.ordinal() + 1;
        }

        public String getSeason() {
            if (this.getNumber() <= 2 || this.getNumber() == 12)
                return "Зима";

            if (this.getNumber() >= 3 && this.getNumber() < 6)
                return "Весна";

            if (this.getNumber() >= 6 && this.getNumber() < 9)
                return "Лето";

            return "Осень";
        }

        public String getDescription() {
            if (this.getSeason() == "Лето")
                return "Теплое время года";

            return "Холодное время года";
        }

        public double getTemp() {
            return this.avgTemp;
        }
    }

    public static void main(String[] args) {
        Month favMonth = Month.AUG;
        System.out.println(favMonth);
        System.out.println("Номер месяца: " + favMonth.getNumber());
        favMonth.getDescription();
        System.out.println("Я люблю " + favMonth.getSeason());
        System.out.println("Ср. температура " + favMonth.getTemp());

        for (int i = 0; i < 12; i++) {
            Month current = Month.values()[i];
            System.out.print(current + " " + current.getDescription());
            System.out.println(", ср. темп. " + current.getTemp());
        }
    }
}
