package ru.mirea.it.java.work11;

import java.util.*;
import java.text.*;

public class Task4 {
   public static void main(String[] args) {
       SimpleDateFormat fmtDate = new SimpleDateFormat("<dd><MM><yyyy>");
       SimpleDateFormat fmtTime = new SimpleDateFormat("<HH><mm>");
       fmtDate.setLenient(false);
       fmtTime.setLenient(false);

       Scanner scanner = new Scanner(System.in);
       String date = scanner.nextLine();
       String time = scanner.nextLine();

       Date dateO = new Date();
       Date timeO = new Date();

       try {
           dateO = fmtDate.parse(date);
           timeO = fmtTime.parse(time);
       } catch (ParseException e) {
           System.out.println("Ошибка, данные введены в неверном формате.");
           System.exit(1);
       }

       Calendar cal = Calendar.getInstance();
       cal.setTime(dateO);
       int year = cal.get(Calendar.YEAR);
       int month = cal.get(Calendar.MONTH);
       int day = cal.get(Calendar.DAY_OF_MONTH);
       
       cal.setTime(timeO);
       int hour = cal.get(Calendar.HOUR_OF_DAY);
       int minute = cal.get(Calendar.MINUTE);
       int second = cal.get(Calendar.SECOND);

       Date finalDate = new Date(year, month, day, hour, minute, second);
       cal.setTime(finalDate);

       System.out.println(finalDate);
       System.out.println(cal);
   }
}
