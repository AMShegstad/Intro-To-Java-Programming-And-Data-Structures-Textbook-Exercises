/*
 * (Find future dates) Write a program that prompts the user to enter an integer
 * for today's day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future day
 * and display the future day of the week.
 */

import java.util.Scanner;

public class exercise_3_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose the day of the week by entering the cooresponding number:");
        System.out.println("0: Sunday\n1: Monday\n2: Tuesday\n3: Wednesday\n4: Thursday\n5: Friday\n6: Saturday");
        int choice = input.nextInt();

        String chosenDay = "x";
        String futureDay = "y";

        // Choose the day of the week depending on the user input.
        switch (choice % 7) {
            case 0:
                chosenDay = "Sunday";
                break;
            case 1:
                chosenDay = "Monday";
                break;
            case 2:
                chosenDay = "Tuesday";
                break;
            case 3:
                chosenDay = "Wednesday";
                break;
            case 4:
                chosenDay = "Thursday";
                break;
            case 5:
                chosenDay = "Friday";
                break;
            case 6:
                chosenDay = "Saturday";
                break;
        }

        System.out.println("Enter the number of days from today");
        int days = input.nextInt();
        input.close();

        // Choose the future day of the week based on the days given.
        switch ((choice + days) % 7) {
            case 0:
                futureDay = "Sunday";
                break;
            case 1:
                futureDay = "Monday";
                break;
            case 2:
                futureDay = "Tuesday";
                break;
            case 3:
                futureDay = "Wednesday";
                break;
            case 4:
                futureDay = "Thursday";
                break;
            case 5:
                futureDay = "Friday";
                break;
            case 6:
                futureDay = "Saturday";
        }

        System.out.println("Your chosen day is " + chosenDay + " and the future day is " + futureDay + ".");
    }
}
