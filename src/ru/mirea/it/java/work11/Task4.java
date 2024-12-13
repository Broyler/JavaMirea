package ru.mirea.it.java.work11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.*;
import java.text.*;

public class Task4 {
   public static void main(String[] args) {
       SimpleDateFormat fmtDate = new SimpleDateFormat("dd.MM.yyyy");
       SimpleDateFormat fmtTime = new SimpleDateFormat("HH:mm");

       System.out.println("Введите дату и время в формате dd.MM.yyyy, затем HH:mm");

       Scanner scanner = new Scanner(System.in);
       String date = scanner.nextLine();
       String time = scanner.nextLine();

       LocalDate dateO;
       LocalTime timeO;

       DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy").withResolverStyle(ResolverStyle.SMART);
       DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm").withResolverStyle(ResolverStyle.SMART);
       try {
           dateO = LocalDate.parse(date, dateFormatter);
           timeO = LocalTime.parse(time, timeFormatter);

           LocalDateTime ldt = dateO.atTime(timeO);
           ZoneId zone = ZoneId.systemDefault();
           Date dateX = Date.from(ldt.atZone(zone).toInstant());

           Calendar cal = Calendar.getInstance();
           cal.setTime(dateX);

           System.out.println(cal);
           System.out.println(cal.get(Calendar.YEAR) + " " + (cal.get(Calendar.MONTH) + 1) + " " + cal.get(Calendar.DAY_OF_MONTH));
           System.out.println(cal.get(Calendar.HOUR_OF_DAY) + " " + cal.get(Calendar.MINUTE) + " " + cal.get(Calendar.SECOND));
       } catch (Exception e) {
           System.out.println("Неверный формат даты/времени.");
           System.exit(1);
       }
   }
}
