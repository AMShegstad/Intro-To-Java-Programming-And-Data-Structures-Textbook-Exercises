/*
(Geometry: Area of a Hexagon) The area of a Hexagon can be computed using the following formula. 's' Is the length of a side.

Area = 6 * s^2 / 4 * tan(PI/6)

Write a program that prompts the user to enter the side of a hexagon and displays the area.
 */

import java.util.Scanner;
import java.math.*;

public class Exercise_4_4 {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for input.
        System.out.print("Please enter the length of a single side of the hexagon:");
        double s = input.nextDouble();

        // Calculate the area.
        double hexagonArea = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/6));

        // Display results.
        System.out.println("A hexagon with a side length of " + s + " has an area of " + hexagonArea + ".");
    }
}
