/*
 * (Find the number of years) Write a program that prompts the user to enter
 * the number of minutes (e.g. 1 billion), and displays the maximum number
 * of years and remaining days for the minutes. For simpliity, assume that a
 * year has 365 days.
 */

import java.util.Scanner;

public class exercise_2_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number of minutes.");
        long minutes = input.nextInt();

        // long year = 365;
        long minutesPerYear = (((24 * 60) * 60) * 365);
        long remainingMinutes = minutes % minutesPerYear;
        long remainingDays = (((remainingMinutes / 60) / 60) / 24);
        long numberOfYears = minutes / minutesPerYear;

        System.out
                .println(minutes + " minutes is equal to " + numberOfYears + " years and " + remainingDays + " days.");
    }
}
