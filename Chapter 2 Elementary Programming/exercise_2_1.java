/*
 * (Converting Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
 * double value from the console, then converts it to Fahrenheit, and displays the result.
 * 
 * The formula for the conversion is as follow:
 * 
 * fahrenheit = (9 / 5) * celsius + 32
 */

import java.util.Scanner;

public class exercise_2_1 {

    public static void main(String[] args) {

        // Creating Scanner Object for reading input from console...
        Scanner input = new Scanner(System.in);

        // Receiving the input from the user
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Doing the math...
        double fahrenheit = (9 / 5) * celsius + 32;

        // Display the result
        System.out.println(celsius + " degrees celsius translates to " + fahrenheit + " degrees fahrenheit");

        input.close();
    }
}
