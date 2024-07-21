package DateNDTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateFounder {
    public static void main(String[] args) {
        // Define the start date
        LocalDate startDate = LocalDate.of(2024, 7, 21);

        // calculate the required date
        LocalDate requirDate = startDate.plusDays(100);

        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = requirDate.format(formatter);

        // print the date
        System.out.println("The required date is: " + formattedDate);
    }
}