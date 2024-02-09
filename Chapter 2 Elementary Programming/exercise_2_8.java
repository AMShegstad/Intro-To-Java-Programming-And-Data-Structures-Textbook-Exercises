/*
 * (Current Time) Listing 2.7, ShowCurrentTime.java, gives a program that displays 
 * the current time in GMT. Revise the program so it prompts the user to enter the
 * time zone offset to GMT and displays the time in the specified time zone.
 * 
 * Here is a sample run:
 * "Enter the time zone offest to GMT" (-5 ENTER)
 * The current time is 4:50:34
 * 
 * Listing 2.7 ShowCurrentTime.java
 * 
 * public class ShowCurrenttime {
 * 
 *  public static void main(String[] args) {
 *      // Obtain the total milliseconds since midnight, Jan 1, 1970
 *      long totalMilliseconds = System.currentTimeMillis();
 * 
 *      // Obtain the total seconds since midnight, Jan 1, 1970
 *      long totalSeconds = totalMilliseconds / 1000;
 * 
 *      // Obtain the current second in the minute in the hour
 *      long currentSecond = totalSeconds % 60;
 * 
 *      // Obtain the total minutes
 *      long totalMinutes = totalSeconds / 60;
 * 
 *      // Compute the current minute in the hour
 *      long currentMinute - totalMinutes % 60;
 * 
 *      // Obtain the total hours
 *      long totalHours = totalMinutes / 60;
 * 
 *      // Compute the current hour
 *      long currentHour = totalHours % 24
 * 
 *      // display results
 *      System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
 * }
 * }
 */

import java.util.Scanner;

public class exercise_2_8 {

    public static void main(String[] args) {

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Obtain the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Creating the scanner for console input
        Scanner input = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Enter the time zone offest to GMT");
        long adjustment = input.nextLong();

        long adjustedHour = adjustForTimeZone(currentHour, adjustment);

        // display results
        System.out.println(
                "The current adjusted time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

    public static long adjustForTimeZone(long currentHour, long adjustment) {

        currentHour = currentHour + adjustment;

        return currentHour;
    }
}
