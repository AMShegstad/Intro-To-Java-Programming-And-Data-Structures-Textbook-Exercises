
/*
 * (Geometry of a Triangle) Write a program that prompts the user to enter three points, (x1, y1), (x2, y2), and 
 * (x3, y3), of a triangle then displays its area. The formula for computing the area of a triangle is:
 * 
 * s = (side1 + side2 + side3) / 2
 * 
 * area = SqrRt( s *(s - side1)(s - side2)(s - side3) )
 */
import java.util.Scanner;

public class exercise_2_19 {

    public static void main(String[] args) {

        // Create the scanner object for user input
        Scanner input = new Scanner(System.in);

        // prompt the user for input, and assign the input to proper variables
        System.out.println("Enter the coordinates for point 1 of the triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter the coordinates for point 2 of the triangle:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter the coordinates for the final point of the triangle:");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        input.close();

        /*
         * 
         * After some work, I found that the formula for the area of a triangle
         * with 3 vertices is as follows:
         * 
         * Area = 0.5|x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
         * where Area is the area of the triangle ABC,
         * (x1,y1) are the coordinates of the vertex A,
         * (x2,y2) are the coordinates of the vertex B,
         * (x3,y3) are the coordinates of the vertex C.
         * 
         * Luckily, I've already assigned values to these variables so I can simply
         * type in the exact same formula.
         * 
         */

        double area = ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))) / 2;

        System.out.println("The area of the triangle with points:\n (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2
                + "), and (" + x3 + ", " + y3 + ") is " + area + ".");

    }
}