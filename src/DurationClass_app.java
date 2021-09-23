import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationClass_app {

    public static void main(String[] args) {

        Duration duration = Duration.ofDays(2);
        System.out.println("Duration of seconds in 2days : " + duration.getSeconds());

        Duration duration1 = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(duration1.get(ChronoUnit.SECONDS));

        Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d1.getSeconds());
        Duration d2 = d1.minus(d1);
        System.out.println(d2.getSeconds());
    }
}
