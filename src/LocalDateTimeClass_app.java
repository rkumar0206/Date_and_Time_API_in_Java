import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeClass_app {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time (Before formatting): " + localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

        System.out.println("Current Date and Time (After formatting): " + localDateTime.format(dtf));

        System.out.println(localDateTime.get(ChronoField.DAY_OF_WEEK));
        System.out.println(localDateTime.get(ChronoField.DAY_OF_YEAR));
        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(localDateTime.get(ChronoField.MINUTE_OF_DAY));

        // minusDays() and plusDays()

        LocalDateTime localDateTime1 = localDateTime.minusDays(2);
        System.out.println("Current Date and Time - 2 days: " + localDateTime1.format(dtf));

        LocalDateTime localDateTime2 = localDateTime.plusDays(4);
        System.out.println("Current Date and Time + 2 days: " + localDateTime2.format(dtf));

    }
}
