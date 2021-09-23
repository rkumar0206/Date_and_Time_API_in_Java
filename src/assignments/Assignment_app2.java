package assignments;

/*
        Write a java class to calculate your experience
        (no. of years, no. of months & no. of days) in Wipro by using java time API.
 */

import java.time.LocalDateTime;

public class Assignment_app2 {

    public static void main(String[] args) {

        LocalDateTime dateOfJoining = LocalDateTime.of(2021, 8, 16, 10, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Experience : \n" +
                "No. of years : " + (now.getYear() - dateOfJoining.getYear())
                + "\nNo. of months : " + (now.getMonth().getValue() - dateOfJoining.getMonth().getValue())
                + "\nNo. of days : " + (now.getDayOfMonth() - dateOfJoining.getDayOfMonth())
        );

    }
}
