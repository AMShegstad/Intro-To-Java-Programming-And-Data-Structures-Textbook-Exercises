/*
* (Geometry: area of a pentagon) Write a program that prompts the user to enter the length
* from the center of a pentagon to a vertex and computes the area of the pentagon.
*
* The formula for computing the area of a pentagon is: Area = (5 * s^2) / 4 * tan(PI/5)
*
* where s is the length of a side. The side can be computed using the following formula:
*
* s = 2r * sin(PI/5) where r is the length from the canter of a pentagon to a vertex.
*
* Round up two digits after the decimal point.
* */

import java.util.Scanner;

public class Exercise_4_1 {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length from the center of the pentagon to a vertex.
        System.out.print("Enter the length from the center of the pentagon to a vertex: ");
        double r = input.nextDouble();
        input.close();

        /* Calculating the length of a side:
        * The length of a side can be found with the following formula:
        * s = 2r * sin(pi/5);
        */
        double s = 2 * r * Math.sin(Math.PI/5);

        /* Calculating the area of the pentagon:
        * The area of a pentagon is as follows:
        * Area = (5 * s^2) / 4 * tan(PI/5)
        * */

        double area = 5 * Math.pow(s,2) / 4 * Math.tan(Math.PI / 5);

        System.out.println("The area of the pentagon with the given distance from the center to a vertex is " + area + ".");
    }

}
