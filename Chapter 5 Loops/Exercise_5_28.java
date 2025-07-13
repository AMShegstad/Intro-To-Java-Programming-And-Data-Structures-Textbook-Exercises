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
        System.out.println("Enter the number for the day of the week:\n1-Monday\n2-Tuesday\n3-Wednesday\n4-Thursday\n5-Friday\n6-Saturday\n7-Sunday");
        int firstDay = input.nextInt();
        input.close();

        displayFirstDaysOfMonths(year, firstDay);
    }

    public static void displayFirstDaysOfMonths(int year, int firstDay) {
        // Array of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};

        // Check for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; // February has 29 days in leap year
        }

        int currentDay = firstDay; // Start with the first day of January

        for (int month = 0; month < 12; month++) {
            String dayName = getDayName(currentDay);
            System.out.println(monthNames[month] + " 1, " + year + " is " + dayName);
            
            // Calculate the first day of next month
            // Add the number of days in current month, then find day of week
            currentDay = (currentDay + daysInMonth[month] - 1) % 7 + 1;
        }
    }

    public static String getDayName(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day";
        }
    }
}
