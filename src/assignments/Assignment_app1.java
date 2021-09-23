package assignments;

// Write a java class to find the date of next month second Sunday by using java time API.

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Assignment_app1 {

    public static void main(String[] args) {

        LocalDate localDateNow = LocalDate.now();

        LocalDate secondSundayOfNextMonth = localDateNow.plusMonths(1).with(
                TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY)
        );

        System.out.println("2nd Sunday of next month is " + secondSundayOfNextMonth);
    }
}
