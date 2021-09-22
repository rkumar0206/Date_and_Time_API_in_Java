import java.time.LocalTime;

public class Local_Time_Class_app {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current time : " + time);

        // of()
        LocalTime t1 = LocalTime.of(6,45,22);
        System.out.println("Time is : " + t1);

        LocalTime t2 = t1.minusHours(4);
        System.out.println("t1 - 4 hrs : " + t2);


    }
}
