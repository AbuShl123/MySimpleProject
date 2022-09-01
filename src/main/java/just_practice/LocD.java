package just_practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class LocD {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, 4, 12));

        System.out.println(LocalDate.of(2005, Month.MARCH, 6));

        LocalDate obj = LocalDate.ofYearDay(2011, 200);
        System.out.println(obj);

        System.out.println(LocalDate.of(1867, Calendar.APRIL, 16));
        System.out.println(LocalDate.ofYearDay(1433, 256));
        System.out.println(LocalDate.ofYearDay(1436, 256));

    }
}
