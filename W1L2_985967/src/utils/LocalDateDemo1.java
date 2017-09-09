package utils;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate oneDecadeAgo = today.minus(1, 
                ChronoUnit.DECADES); // Standard set of date period units - 1 Decade = 10 years
        LocalTime timeOnly = LocalTime.now(); // Time is represented to nanosecond precision
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
        		
        System.out.println("Day of month: " 
                + today.getDayOfMonth());
        System.out.println("Today is " + today);
        System.out.println("Tomorrow is " + tomorrow);
        System.out.println("A decade ago was " + oneDecadeAgo);
        System.out.println("Year : " 
                + today.get(ChronoField.YEAR));
        System.out.println("Day of year:" + today.getDayOfYear());  
        System.out.println("Current Time : " + timeOnly);
        System.out.println("Current Date and Time : " + dateTime);
        System.out.println("Current Date and Time with Zone: " + dateTimeWithZone);
        System.out.println("Is Leap Year : " + today.isLeapYear());
    }
}