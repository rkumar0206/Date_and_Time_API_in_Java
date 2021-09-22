import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeClass_app {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Calcutta]");
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2019, Month.JUNE, 02, 12, 12, 56);

        ZoneId zoneId = ZoneId.of("Asia/Calcutta");

        ZonedDateTime zone1 = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println("In India Central Time Zone: " + zone1);

        ZoneId zoneId_Tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2 = ZonedDateTime.of(localDateTime, zoneId_Tokyo);
        System.out.println("In Tokyo Central Time Zone: "  + zone2);

        // getZone()

        ZonedDateTime zone3 = ZonedDateTime.now();
        System.out.println(zone3.getZone());

    }
}
