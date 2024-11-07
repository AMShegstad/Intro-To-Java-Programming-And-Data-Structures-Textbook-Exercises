/*
 * Exercise 5.1
 * 
 * (Count positive and negative numbers and computer the average of numbers) Write a program that reads and unspecified
 * number of integers, determines how many positive nad negative values have been read, and computes the total and 
 * average pf the input values (not counting zeroes). Your program ends with the input 0. Displat the average as a 
 * floating point number.
 */
import java.util.Scanner;

public class Exercise_5_1 {
    // main class
    public static void main(String[] args){

        
        // Create the Scanner object
        Scanner input = new Scanner(System.in);

        // Create variables for use in do-while loop
        // Maintaining global scope will make it easier for me.
        int count = 0;
        int sum = 0;
        int number;
        double average;

        // Loop time.
        do {
            System.out.println("Please begin entering integers. Input stops when you enter zero(0): ");
            number = input.nextInt();
            count++;
            sum = sum + number;
            average = sum / count;
        } while (number != 0);

        // Close the scanner, resource management should be best practice.
        input.close();
        System.out.println("The total sum of entered numbers is " + sum + ".");
        System.out.println("The average of entered numbers is " + average + ".");

    }
}
