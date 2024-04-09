/*
 * (Science: Day of the week) Zeller's congruence is an algorithm developed by Christian
 * Zeller to calculate the day of the week. The formla is:
 * 
 * h = ( q + ( 26(m+1) / 10 ) + k + (k/4) + (j/4) + 5j ) % 7
 * 
 * where
 * 
 * "h" is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
 * "q" is the day of the month.
 * "m" is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.
 * "j" is (year/100)
 * "k" is the year of the century (i.e. year % 100).
 * 
 * Note all divisions in this exercise perform an integer division. Write a program that 
 * prompts the user to enter a year, month, and day of the week.
 * 
 * (Hint: January and February are caounted as 13 and 14 in the formula, so you need to
 * convert the user input from 1 to 13 and 2 to 14 for the month and change the year to 
 * the previous year. For example, if the user enters 1 for m and 2015 for year, m will
 * be 13 and year will be 2014 used in the formula.)
 */

import java.util.Scanner;

public class exercise_3_21 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = input.nextInt();

        System.out.println("Enter the number of the month - 1: January, 2: February, ..., 12: December");
        int month = input.nextInt();

        if (month == 1) {
            month = 13;
            year = year--;
        } else if (month == 2) {
            month = 14;
            year = year--;
        }

        System.out.println("Enter the day of the month:");
        int day = input.nextInt();

        input.close();

        int k = (year % 100) - 1;
        int j = year / 100;

        int h = ( day + ( 26 * (month+1) / 10 ) + k + (k/4) + (j/4) + (5 * j) ) % 7;
        

        if (h == 0) {
            System.out.println("The day of the week is a Saturday.");
        } else if (h == 1 ) {
            System.out.println("The day of the week is a Sunday.");
        } else if (h == 2) {
            System.out.println("The day of the weeks is a Monday.");
        } else if (h == 3) {
            System.out.println("The day of the week is a Tuesday.");
        } else if (h == 4) {
            System.out.println("The day of the week is a Wednesday.");
        } else if (h == 5) {
            System.out.println("The day of the week is a Thursday.");
        } else if (h == 6) {
            System.out.println("The day of the week is a Friday.");
        } else {
            System.out.println("Error. Day range exceeded.");
        }
    }
}
