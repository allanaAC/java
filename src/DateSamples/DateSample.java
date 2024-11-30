package DateSamples;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Input first date
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String date1String = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(date1String, formatter);

            // Input second date
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String date2String = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(date2String, formatter);

            // Calculate the period between the two dates
            Period period = Period.between(date1, date2);

            // Get the year difference
            int yearDifference = Math.abs(period.getYears());

            // Print the result
            System.out.println("The year difference between the two dates is: " + yearDifference + " years");

        } catch (Exception e) {
            System.out.println("Error: Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}

