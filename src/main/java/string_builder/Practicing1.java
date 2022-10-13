package string_builder;

import javax.sound.sampled.Line;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Practicing1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("abcd");
        StringBuilder sb2 = new StringBuilder("abcd");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(Objects.equals(sb1, sb2));

        // they all only checking if the references are pointing to the same StringBuilder object. Not values

        StringBuilder clone = sb2;
        System.out.println(clone == sb2);
        System.out.println(clone.equals(sb2));
        System.out.println(Objects.equals(clone, sb2));

        // this is the proof.

        String a = "ff" + true;
        System.out.println(a == "ff");

        int[] arr = new int[3];

        List<String> g = new ArrayList<>();

        LocalDate l = LocalDate.of(2021, 4, 13);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(l.format(f));
        System.out.println(f.format(l));

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
                .SHORT);
        System.out.println(f2.format(d));

    }
}
