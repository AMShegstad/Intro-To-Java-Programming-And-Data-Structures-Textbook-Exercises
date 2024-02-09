/*
 * (Physics: Finding runway length) Given an airplane's acceleration a and 
 * take-off speed v, you can compute the minimum runway length needed for
 * and airplane to take off using the following formula
 * 
 * length = (v^2)/2a
 * 
 * Write a program that prompts the user to enter v in meters/second (m/s)
 * and the acceleration a in meters/second squared (m/s^2), then, displays
 * the minimum runway length.
 * 
 */

import java.util.Scanner;

public class exercise_2_12 {

    public static void main(String[] args) {

        // Get the user input, because of course.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the speed in meters/second:\n");
        long v = input.nextLong();

        System.out.print("Please enter the acceleration in meters/seconds^2:\n");
        long a = input.nextLong();

        input.close();

        // Time to do the math...
        double n = Math.pow(v, 2);
        long numerator = (long) n;
        long denominator = a * 2;
        long length = numerator / denominator;

        System.out.println("The minimum runway length is : " + length);

    }
}
