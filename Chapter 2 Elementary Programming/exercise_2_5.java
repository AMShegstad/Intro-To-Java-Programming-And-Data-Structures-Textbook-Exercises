/*
 * (Financial Application - Calculating Tips) Write a program that reads the subtotal and the gratuity rate,
 * then computes the gratuity and total. For example, if the user enters 10 for the subtotal, and 15% for a
 * gratuity rate, the program will display $1.5 as the gratuity and $11.5 as the total
 */

import java.util.Scanner;

public class exercise_2_5 {

    public static void main(String[] args) {

        // Creating the scanner object for console input
        Scanner input = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Please enter the subtotal of the meal and the gratuity percent: ");

        // Applying input values to variables for computing
        double subtotal = input.nextDouble();
        double tipPercent = input.nextDouble();

        // Creating other variables for additional computing
        double tipQuotient = tipPercent / 100;
        double tip = subtotal * tipQuotient;
        double total = subtotal + tip;

        // Showing off the goods
        System.out.println("The tip is " + tip + " and the total is " + total);

        // Gotta close that damn scanner. (RESOURCE LEAK)
        input.close();
    }

}
