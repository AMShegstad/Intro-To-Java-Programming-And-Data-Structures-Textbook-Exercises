
/*
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and the year and displays the number of days in the 
 * month. For example, if the user entered month 2 and year 2012, the program
 * should display that February has 29 days. If the user entered month 3 and
 * year 2015, the program should display that March has 31 days.
 */
import java.util.Scanner;

public class exercise_3_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose the month by entering its cooresponding number:");
        System.out.println("1: January\n2: February\n3: March\n4: April\n5: May\n6: June");
        System.out.println("7: July\n8: August\n9: September\n10: October\n11: November\n:12: December");

        int choice = input.nextInt();

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        input.close();

        String month = null;

        int days;

        if (choice == 1) {
            month = "January";
        } else if (choice == 2) {
            month = "February";
        } else if (choice == 3) {
            month = "March";
        } else if (choice == 4) {
            month = "April";
        } else if (choice == 5) {
            month = "May";
        } else if (choice == 6) {
            month = "June";
        } else if (choice == 7) {
            month = "July";
        } else if (choice == 8) {
            month = "August";
        } else if (choice == 9) {
            month = "September";
        } else if (choice == 10) {
            month = "October";
        } else if (choice == 11) {
            month = "November";
        } else if (choice == 12) {
            month = "December";
        } else {
            month = "Error";
        }

        // Checking for Leap Year if choice is February
        if (choice == 2) {
            if (year % 100 == 0 && year % 400 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (choice == 1 || choice == 3 || choice == 5 || choice == 7 || choice == 8
                || choice == 10 || choice == 12) {
            days = 31;
        } else {
            days = 30;
        }

        System.out.println("The month of " + month + " in the year " + year + " has " + days + " days in it.");
    }
}
