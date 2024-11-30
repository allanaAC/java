package DateSamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        /*try {
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
            System.out.println("The year difference between the two dates is: " + yearDifference + " years");*/

            String dateString = "2023-01-31";
            SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
            //java8
            // Parse the string to a LocalDate
            LocalDate date = LocalDate.parse(dateString);

            // Extract the year
            int year = date.getYear();

            System.out.println("Year: " + year);

            try {
                Date date1 = formatter1.parse(dateString);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date1);
                int year1 = calendar.get(Calendar.YEAR);
                System.out.println("Year: " + year1);
            } catch (ParseException e) {
                e.printStackTrace();
            }


        /*} catch (Exception e) {
            System.out.println("Error: Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }*/
    }
}

