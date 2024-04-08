/*
 * (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle 
 * and computes the perimeter if the input is valid. Otherwise, display that the input is invalid.
 * The input is valid is the sum of every pair of two edges is greaters than the remaining edge.
 * 
 */

import java.util.Scanner;

public class exercise_3_19 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lengths of each side of a triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.close();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Side lengths cannot be negative or zero.");
        } else {
            if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
                System.out.println("The sides of the triangle are valid.");
                System.out.println("The perimeter of the triangle is " + (side1 + side2 + side3) + ".");
            } else {
                System.out.println("The sides of your triangle are not valid. Please try again.");
            }
        }
    }
}
