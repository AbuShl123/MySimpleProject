package time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 10, 6); // year-month-day
        java.time.LocalTime time = java.time.LocalTime.of(12, 23); // hour-minutes (seconds and nanos are optional)

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime);

        date = date.plusDays(15);
        System.out.println(date);
        date = date.minusWeeks(2);
        System.out.println(date);
        System.out.println(dateTime);
        dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        Period period = Period.of(0, 0, 23);
        dateTime = dateTime.plus(period);
        System.out.println("after: " + dateTime);
        period = Period.of(0, 2, 0);
        dateTime = dateTime.plus(period);
        System.out.println("after: " + dateTime);
        period = Period.of(1,0,23);
        dateTime = dateTime.plus(period);
        System.out.println("after: " + dateTime);
    }
}
