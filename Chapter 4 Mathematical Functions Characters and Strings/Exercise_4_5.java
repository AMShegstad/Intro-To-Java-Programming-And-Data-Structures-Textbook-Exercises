/*
(Geometry: Area of a regular polygon) A regular polygon is an n-sided polygon in which all sides are of the same length
and all angles have the same degree (i.e. the polygon is both equilateral and equiangular). The formula for computing
the area of a regular polygon is:

Area = (n * s^2) / (4 * tan(PI / n))

Here, s is the length of a side. Write a program that prompts that user to enter the number of sides and their length of
a regular polygon and displays its area.
 */

import java.util.Scanner;
import java.math.*;

public class Exercise_4_5 {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for input.
        System.out.println("How many sides does the polygon have?");
        double n = input.nextDouble();

        System.out.println("How long is are the sides?");
        double s = input.nextDouble();

        // Math time!
        double area = (n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n)));

        // Display the result.
        System.out.println("The area of your " + n +"-sided polygon with sides the length of " + s + " is " + area + ".");
    }
}
