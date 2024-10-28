/*
* (Geometry: great circle distance) The great circle distance is the distance between two points on the surface of
* a sphere. Let (x1, y1) and (x2,y2) be the geographical latitude and longitude of two points. The great circle distance
* between the two points can be computed using the following formula:
*
*     d = radius * acos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)
*
* Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees and
* displays its great circle distance. The average radius of the earth is 6371.01km. Note, you need to convert the degrees
* into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and longitude
* degrees in the formula are for north and west. Use negative to indicate south and east degrees.
* */

import java.util.Scanner;
import java.math.*;

public class Exercise_4_2 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the Longitude and Latitude of point 1...
        System.out.print("Please enter the longitude and latitude of the first point.");
        double x1degrees = input.nextDouble();
        double y1degrees = input.nextDouble();

        // Prompt the user to enter the Longitude and Latitude of point 2...
        System.out.println("Please enter the longitude and latitude of the second point.");
        double x2degrees = input.nextDouble();
        double y2degrees = input.nextDouble();

        // Convert degrees to radians.
        double x1radians = Math.toRadians(x1degrees);
        double x2radians = Math.toRadians(x2degrees);
        double y1radians = Math.toRadians(y1degrees);
        double y2radians = Math.toRadians(y2degrees);

        // Can't complete the formula with the radius, provided in text.
        double radius = 6371.01;

        // formula time!
        double d = radius * Math.acos(Math.sin(x1radians) * Math.sin(x2radians) + Math.cos(x1radians) * Math.cos(x2radians) * Math.cos(y1radians - y2radians));

        // Display the results.
        System.out.println("The Great Circle Distance between the two given points is " + d + " kilometers.");
    }
}
