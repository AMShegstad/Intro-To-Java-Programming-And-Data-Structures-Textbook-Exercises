/*
 * LeapYear.java
 */

import java.util.Scanner;

public class Listing_3_7 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enterv a year: ");
        int year = input.nextInt();
        input.close();

        // Check if the year is a leap year.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));

        // Display the result
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
