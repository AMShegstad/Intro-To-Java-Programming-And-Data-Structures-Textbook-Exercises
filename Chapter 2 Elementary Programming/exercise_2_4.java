/*
 * (Convert pounds into Kilograms) Write a program that converts pounds into Kilograms. 
 * The program pompts the user to enter a number in pounds, converts it into Kilograms, 
 * and displays the result. One pound is equal to 0.454 Kilograms.
 */

import java.util.Scanner;

public class exercise_2_4 {

    public static void main(String[] args) {

        // Creating the scanner object for console input
        Scanner input = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Please enter a number in LBS:");

        // Assigning the user's value to a variable
        double lbs = input.nextDouble();

        input.close();

        // Converting LBS to Kilos
        double kilos = lbs * 0.454;

        // Displaying the result
        System.out.println(lbs + " lbs is equal to " + kilos + " kilograms.");
    }
}
