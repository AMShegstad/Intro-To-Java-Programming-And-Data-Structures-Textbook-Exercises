/*
 * (Cost of Shipping) A shipping company uses the following function to calculate the cost
 * in dollars of shipping based on the weight of the package in LBS.
 * 
 *          3.5, if 0 < w <= 1
 *          5.5, if 1 < w <= 3
 * c(w)     8.5, if 3 < w <= 10
 *          10.5, if 10 < w <= 20
 * 
 * Write a program that prompts the user to enter the weight of the package and displays
 * the shipping cost. If the weight is negative or zero, display the message "Invalid Input".
 * If the weight is greater than 20lbs, display the message "The package cannot be shipped."
 */

import java.util.Scanner;

public class exercise_3_18 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight of your package:");
        double weight = input.nextInt();
        input.close();

        double rate = 0;

        if (weight <= 0) {
            System.out.println("Invalid Input.");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else {
            if (weight > 0 && weight <= 1) {
                rate = 3.50;
            } else if (weight > 1 && weight <= 3) {
                rate = 5.50;
            } else if (weight > 3 && weight <= 10) {
                rate = 8.50;
            } else if (weight > 10 && weight <= 20) {
                rate = 10.50;
            }
        }

        System.out.println("It will cost $" + rate + " to ship your package.");
    }
}
