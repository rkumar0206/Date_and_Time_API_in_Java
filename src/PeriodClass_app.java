import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

/*
Java Period class is used to measures time in years, months and days.
 It inherits the Object class and implements the ChronoPeriod interface.
 */

// https://www.javatpoint.com/java-period
public class PeriodClass_app {

    public static void main(String[] args) {

        Period period = Period.ofDays(30);
        Temporal temporal = period.addTo(LocalDate.now());
        System.out.println(temporal);

        Period period1 = Period.of(2019, 4,11);
        System.out.println(period1.toString());
    }
}
