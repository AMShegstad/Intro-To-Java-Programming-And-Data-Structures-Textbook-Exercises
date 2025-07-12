/*
 * (Display the first days of each month)
 * 
 * WRite a program that prompts the user to enter the year and first day of the year, then displays the
 * first day of each month in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
 * January 1, 2013, your program should display the following output:
 * 
 * January 1, 2013 is Tuesday
 * ...
 * December 1, 2013 is Sunday
 */
import java.util.Scanner;

public class Exercise_5_28 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the number for the day of the week. /n 1- Monday/n 2-Tuesday/n 3-Wednesday/n 4-Thursday/n 5-Friday/n 6-Saturday/n 7-Sunday");
        int day = input.nextInt();
        input.close();

        displayFirstDaysOfMonths(year, day);
    }

    public static void displayFirstDaysOfMonths(int year, int day) {

        
    }
}
