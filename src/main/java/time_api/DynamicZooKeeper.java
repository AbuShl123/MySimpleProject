package time_api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DynamicZooKeeper {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofWeeks(1);
        performAnimalEnrichment(start, end, period);
    }

    public static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("Give a toe: " + start);
            start = start.plus(period);
        }
    }
}
