import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;


public class Main{
    public static void main(String[] args){
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        // LocalDate date = LocalDate.now();
        // System.out.println("Current Date: " + date);

        // LocalTime time = LocalTime.now();
        // System.out.println("Current Time: " + time);

        // LocalDateTime dateTime = LocalDateTime.now();
        // System.out.println("Current Date and Time: " + dateTime);

        // Instant timestamp = Instant.now();
        // System.out.println("Current UTC Timestamp: " + timestamp);

        //Custom format:
        // LocalDateTime dateTime = LocalDateTime.now();
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // String formattedDateTime = dateTime.format(formatter);
        // System.out.println("Formatted Date and Time: " + formattedDateTime);

        //Comparing Dates:
        LocalDateTime date1 = LocalDateTime.of(2024, 6, 1, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2024, 7, 1, 12, 0, 0);
        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2.");
        }
        else if(date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2.");
        }
        else if(date1.isEqual(date2)) {
            System.out.println("Date1 is equal to Date2.");
        }
        else {
            System.out.println("Date1 is not before Date2.");
        }
    }
}