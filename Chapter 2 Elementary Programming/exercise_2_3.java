/*
 * (Converting feet into meters) Write a program that reads a number in feet, 
 * converts it to meters, and displays the result. One foot it equal to 0.305 meters.
 */

import java.util.Scanner;

public class exercise_2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number in feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;

        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}
