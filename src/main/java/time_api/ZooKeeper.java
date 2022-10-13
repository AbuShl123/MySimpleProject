package time_api;

import java.time.LocalDate;
import java.time.Month;

public class ZooKeeper {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }

    public static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Give new toe: " + start);
            start = start.plusMonths(1);
        }
    }
}
