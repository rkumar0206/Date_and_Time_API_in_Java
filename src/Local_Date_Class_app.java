import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// https://www.javatpoint.com/java-localdate
public class Local_Date_Class_app {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);

        System.out.println("Today date: " + localDate);
        System.out.println("Yesterday date: " + yesterday);
        System.out.println("Tomorrow date: " + tomorrow);

        // finding leap if the the year was leap or not

        LocalDate l1 = LocalDate.of(2024, 8, 2);
        System.out.println(l1 + " is a leap year : " + l1.isLeapYear());

        // format() method

        // Converting LocalDate to String
        String localString = localDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println(localString);

        // parse()

        String dateString = "2019-06-02";
        LocalDate parsedDate = LocalDate.parse(dateString);

        System.out.println("Parsed date : " +parsedDate);

    }
}
